package com.DojoandNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.DojoandNinjas.models.Dojo;
import com.DojoandNinjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	List<Ninja> findAll();
	List<Ninja> findAllByDojo(Dojo dojo);
}
