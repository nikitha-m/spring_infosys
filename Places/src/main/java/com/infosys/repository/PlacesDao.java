package com.infosys.repository;

import java.util.List;

import com.infosys.entity.Places;

public interface PlacesDao {
	public void addPlace(Places p);

	public Places findByCity(String city);

	public List<Places> findAll();

	public void updatePlace(Places p);

    public void deletePlace(Places p);
}
