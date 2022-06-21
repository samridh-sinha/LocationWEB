package com.samridh.location.services;

import java.util.List;

import com.samridh.location.entities.Location;

public interface LocationService { 
	
	Location saveLocation(Location l); 
	Location updateLocation(Location l); 
	void deleteLocation(Location l); 
	Location getLocationById(int id);  
	List<Location> getAllLocations(); 
	
	

}
