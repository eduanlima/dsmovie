package com.eduanlima.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduanlima.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
}
