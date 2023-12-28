package com.WaterBnB.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.WaterBnB.models.Listing;
import com.WaterBnB.models.User;

@Repository
public interface ListingRepo extends CrudRepository<Listing, Long> {
	List<Listing> findAll();
	List<Listing> findByHostIs(User host);
	List<Listing> findByLocationContains(String phrase);
	Listing findByIdIs(Long id);
}
