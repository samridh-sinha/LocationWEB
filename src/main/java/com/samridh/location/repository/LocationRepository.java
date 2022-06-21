package com.samridh.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samridh.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
