package de.flightboard;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.springframework.core.Ordered;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.TestExecutionListener;
import org.testcontainers.containers.PostgreSQLContainer;

public class PostgresTestExtension implements TestExecutionListener, BeforeEachCallback, Ordered {

  private static PostgreSQLContainer postgresContainer = new PostgreSQLContainer("postgres:13.1-alpine");

  static {
    postgresContainer.start();
    setProperties();
  }

  private static void setProperties() {
    System.setProperty("spring.datasource.url", postgresContainer.getJdbcUrl());
    System.setProperty("spring.datasource.username", postgresContainer.getUsername());
    System.setProperty("spring.datasource.password", postgresContainer.getPassword());
    System.setProperty("spring.datasource.driver-class-name", postgresContainer.getDriverClassName());
  }

  @Override
  public void afterTestMethod(TestContext testContext) throws Exception {
    Flyway flyway = testContext.getApplicationContext().getBean(Flyway.class);
    flyway.clean();
    flyway.migrate();
  }

  @Override
  public void beforeEach(ExtensionContext extensionContext) throws Exception {
    setProperties();
  }

  @Override
  public int getOrder() {
    return Ordered.HIGHEST_PRECEDENCE;
  }
}

