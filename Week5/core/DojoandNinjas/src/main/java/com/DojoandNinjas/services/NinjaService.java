package com.DojoandNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DojoandNinjas.models.Dojo;
import com.DojoandNinjas.models.Ninja;
import com.DojoandNinjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository ninjaRepo;

	// returns all the ninjas
	public List<Ninja> all() {
		return ninjaRepo.findAll();
	}

	// creates a ninja
	public Ninja create(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}

	// retrieves a ninja
	public Ninja find(Long id) {
		Optional<Ninja> result = ninjaRepo.findById(id);
		if (result.isPresent()) {
			return result.get();
		} else {
			return null;
		}
	}

	public List<Ninja> byDojo(Dojo dojo) {
		return ninjaRepo.findAllByDojo(dojo);
	}
}
