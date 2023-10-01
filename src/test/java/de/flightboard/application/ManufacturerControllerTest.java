package de.flightboard.application;

import de.flightboard.IntegrationTest;
import de.flightboard.domain.entities.Manufacturer;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@IntegrationTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        loader = AnnotationConfigContextLoader.class)
public class ManufacturerControllerTest {

    @Autowired
    private ManufacturerController manufacturerController;

    @Test
    public void findAllManufacturersTest(){
        List<Manufacturer> manufacturerList = this.manufacturerController.findAll();

        assertEquals(2, manufacturerList.size());
    }

    @Test
    public void deleteManufacturerTest(){
        List<Manufacturer> manufacturerList = this.manufacturerController.findAll();
        this.manufacturerController.deleteManufacturer(manufacturerList.get(0).getId().toString());
        manufacturerList = this.manufacturerController.findAll();

        assertEquals(1, manufacturerList.size());
    }
}
