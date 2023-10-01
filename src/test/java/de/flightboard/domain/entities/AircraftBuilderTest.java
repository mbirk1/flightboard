package de.flightboard.domain.entities;

import de.flightboard.IntegrationTest;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        loader = AnnotationConfigContextLoader.class)
@IntegrationTest
public class AircraftBuilderTest {

    @Test
    public void createFullAircraftTest() {
        Aircraft aircraft = new Aircraft.AircraftBuilder()
                .widthModel("Lufthansa")
                .withHeigth(12.0)
                .withWidth(12.0)
                .withLength(12.0)
                .build();

        assertNotNull(aircraft.getModel());
        assertNotNull(aircraft.getHeight());
        assertNotNull(aircraft.getWidth());
        assertNotNull(aircraft.getLength());
        assertNotNull(aircraft.getId());
    }

    @Test
    public void createAircraftWithoutModelNameTest() {
        Aircraft.AircraftBuilder aircraft = new Aircraft.AircraftBuilder()
                .withHeigth(12.0)
                .withWidth(12.0)
                .withLength(12.0);
        assertThrows(IllegalArgumentException.class, aircraft::build);
    }

    @Test
    public void createAircraftWithoutHeigthNameTest() {
        Aircraft aircraft = new Aircraft.AircraftBuilder()
                .widthModel("A380")
                .withWidth(12.0)
                .withLength(12.0)
                .build();

        assertEquals(0.0, aircraft.getHeight());
    }

    @Test
    public void createAircraftWithoutWidthNameTest() {
        Aircraft aircraft = new Aircraft.AircraftBuilder()
                .widthModel("A380")
                .withHeigth(12.0)
                .withLength(12.0)
                .build();

        assertEquals(0.0, aircraft.getWidth());
    }

    @Test
    public void createAircraftWithoutLengthNameTest() {
        Aircraft aircraft = new Aircraft.AircraftBuilder()
                .widthModel("A380")
                .withWidth(12.0)
                .withHeigth(12.0)
                .build();

        assertEquals(0.0, aircraft.getLength());
    }
}
