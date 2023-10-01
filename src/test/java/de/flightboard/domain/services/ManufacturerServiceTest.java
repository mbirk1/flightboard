package de.flightboard.domain.services;

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
public class ManufacturerServiceTest {

    @Autowired
    private ManufacturerService manufacturerService;

    @Test
    public void findAllTest(){
        List<Manufacturer> manufacturers = this.manufacturerService.findAll();

        assertEquals(2, manufacturers.size());
    }

    @Test
    public void deleteManufacturerTest(){
        List<Manufacturer> manufacturers = this.manufacturerService.findAll();

        this.manufacturerService.deleteManufacturer(manufacturers.get(0).getId());
        manufacturers = this.manufacturerService.findAll();

        assertEquals(1, manufacturers.size());
    }
}
