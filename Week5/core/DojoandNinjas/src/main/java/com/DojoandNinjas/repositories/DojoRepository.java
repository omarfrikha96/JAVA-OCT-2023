package com.DojoandNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.DojoandNinjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
	List<Dojo> findAll();
}
