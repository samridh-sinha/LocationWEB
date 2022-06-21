package com.samridh.location;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.samridh.location.entities.Location;

import com.samridh.location.services.LocationService;

@SpringBootTest
class LocationApplicationTests {

	@Autowired
	LocationService location;  
	
	@Test 
	void createLocation() {
		Location l = new Location(); 
		l.setName("New York1"); 
		l.setCode("NYC1"); 
		l.setType("Urban1"); 
		location.saveLocation(l);
	} 
	
	@Test 
	void getLocationByid() {
		Location l = location.getLocationById(8); 
		System.out.println(l.toString());
	}
	@Test 
	void deleteLocation() { 
		Location l = location.getLocationById(11); 
		location.deleteLocation(l);
	}

}
