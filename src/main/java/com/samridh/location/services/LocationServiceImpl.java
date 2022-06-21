package com.samridh.location.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samridh.location.entities.Location;
import com.samridh.location.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService { 
	
	@Autowired
	private LocationRepository repo;  

	@Override
	public Location saveLocation(Location l) {
		return repo.save(l);
	}

	@Override
	public Location updateLocation(Location l) {
		
		return repo.save(l);
	}

	@Override
	public void deleteLocation(Location l) {
		
		repo.delete(l);

	}

	@Override
	public Location getLocationById(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public List<Location> getAllLocations() {
		
		return repo.findAll();
	}

}
