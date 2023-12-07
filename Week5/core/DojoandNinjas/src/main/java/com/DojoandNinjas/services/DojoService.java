package com.DojoandNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DojoandNinjas.models.Dojo;
import com.DojoandNinjas.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dojoRepo;

	// returns all the Dojos
	public List<Dojo> all() {
		return dojoRepo.findAll();
	}

	// creates a dojo
	public Dojo create(Dojo dojo) {
		System.out.println(dojo.getId());
		return dojoRepo.save(dojo);
	}

	// find a dojo
	public Dojo find(Long id) {
		Optional<Dojo> result = dojoRepo.findById(id);
		if (result.isPresent()) {
			return result.get();
		} else {
			return null;
		}
	}
}
