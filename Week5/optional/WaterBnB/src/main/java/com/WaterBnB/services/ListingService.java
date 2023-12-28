package com.WaterBnB.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.WaterBnB.models.Listing;
import com.WaterBnB.models.User;
import com.WaterBnB.repositories.ListingRepo;

@Service
public class ListingService {
private final ListingRepo listingRepo;
	
	public ListingService(ListingRepo listingRepo) {
		this.listingRepo = listingRepo;
	}
	
	public List<Listing> allListings(){
		return listingRepo.findAll();
	}
	
	public List<Listing> findByUser(User user){
		return listingRepo.findByHostIs(user);
	}
	
	public List<Listing> findByLocation(String loc){
		return listingRepo.findByLocationContains(loc);
	}
	
	public Listing updateListing(Listing listing) {
		return listingRepo.save(listing);
	}
	
	public Listing addListing(Listing listing) {
		return listingRepo.save(listing);
	}
	
	public void deleteListing(Listing listing) {
		listingRepo.delete(listing);
	}
	
	public Listing findById(Long id) {
		Optional<Listing> optionalListing = listingRepo.findById(id);
		if(optionalListing.isPresent()) {
			return optionalListing.get();
		}else {
			return null;
		}
	}

}
