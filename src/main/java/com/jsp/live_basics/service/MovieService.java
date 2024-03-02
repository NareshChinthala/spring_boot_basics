package com.jsp.live_basics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.live_basics.dao.MovieDao;
import com.jsp.live_basics.entity.Movie;
import com.jsp.live_basics.exception.MovieNotFound;
import com.jsp.live_basics.util.ResponseStructure;

@Service

public class MovieService {
	@Autowired
	private MovieDao dao;
	
	// save
	public ResponseEntity<ResponseStructure<Movie>> saveMovie(Movie movie){
		ResponseStructure<Movie> m=new ResponseStructure<Movie>();
		m.setStatusCode(HttpStatus.CREATED.value());
		m.setMessage("Data is saved Successfully...! ");
		m.setData(dao.saveMovie(movie));
		return new ResponseEntity<ResponseStructure<Movie>>(m, HttpStatus.CREATED);
	}
	
	// fetch 
	public ResponseEntity<ResponseStructure<Movie>>fetchById(int id){
		Movie db = dao.fetch(id);
		if(db!=null) {
			ResponseStructure<Movie> m=new ResponseStructure<Movie>();
			m.setData(db);
			m.setMessage("movie found successfully .....");
			m.setStatusCode(HttpStatus.FOUND.value());
			return new ResponseEntity<ResponseStructure<Movie>>(m,HttpStatus.FOUND);
			}
		else {
			throw new MovieNotFound("MOvie not fetched ....");
		}
	}
	
	
	
	
	
	
	

}
