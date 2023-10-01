package de.flightboard.domain.entities;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        loader = AnnotationConfigContextLoader.class)
@SpringBootTest
public class ManufacturerTest {

    @Test
    public void constructorTest(){
        Manufacturer manufacturer = new Manufacturer(UUID.randomUUID(), "Test");

        assertEquals("Test", manufacturer.getName());
    }
}
