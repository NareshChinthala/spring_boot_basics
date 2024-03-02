package com.jsp.live_basics.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.live_basics.entity.Movie;
import com.jsp.live_basics.repo.Repo;

@Repository

public class MovieDao {
	@Autowired
	private Repo repo;
	
	//save
	
	public Movie saveMovie(Movie movie) {
	return	repo.save(movie);
	}
	
	//update
	
	public Movie updateMovie(Movie movie) {
		Optional<Movie> db = repo.findById(movie.getId());
		if(db.isEmpty()) {
			return null;
		}
		else {
			return repo.save(movie);
		}
	}
	
	// delete
	
	public Movie deleteMovie(int id) {
		Optional<Movie> db = repo.findById(id);
		if(db.isEmpty()) {
			return null;
		}
		else {
			repo.deleteById(id);
			return db.get();
		}
	}
	
	// fetch 
	
	public Movie fetch(int id) {
		Optional<Movie> db = repo.findById(id);
		if(db.isEmpty()) {
			return null;
		}
		else {
			return db.get();
		}
	}

}
