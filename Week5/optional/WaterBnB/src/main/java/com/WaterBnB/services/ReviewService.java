package com.WaterBnB.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.WaterBnB.models.Listing;
import com.WaterBnB.models.Review;
import com.WaterBnB.repositories.ReviewRepo;

@Service
public class ReviewService {
private final ReviewRepo reviewRepo;
	
	public ReviewService(ReviewRepo reviewRepo) {
		this.reviewRepo = reviewRepo;
	}
	
	public List<Review> allReviews(){
		return reviewRepo.findAll();
	}
	
	public List<Review> findByLocation(Listing listing){
		return reviewRepo.findByListingIs(listing);
	}
	
	public Review updateReview(Review review) {
		return reviewRepo.save(review);
	}
	
	public Review addReview(Review review) {
		return reviewRepo.save(review);
	}
	
	public void deleteReview(Review review) {
		reviewRepo.delete(review);
	}
	
	public Review findById(Long id) {
		Optional<Review> optionalReview = reviewRepo.findById(id);
		if(optionalReview.isPresent()) {
			return optionalReview.get();
		}else {
			return null;
		}
	}

}
