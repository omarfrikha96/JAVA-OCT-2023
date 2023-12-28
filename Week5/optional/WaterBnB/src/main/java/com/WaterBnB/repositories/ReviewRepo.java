package com.WaterBnB.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.WaterBnB.models.Listing;
import com.WaterBnB.models.Review;

@Repository
public interface ReviewRepo extends CrudRepository<Review, Long> {
	List<Review> findAll();
	List<Review> findByListingIs(Listing listing);
}
