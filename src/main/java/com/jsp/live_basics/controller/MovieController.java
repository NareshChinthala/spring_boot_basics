package com.jsp.live_basics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.live_basics.entity.Movie;
import com.jsp.live_basics.service.MovieService;
import com.jsp.live_basics.util.ResponseStructure;

@RestController

public class MovieController {
	

	@Autowired
	private MovieService service;
	
	
	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<Movie>> saveMovie(@RequestBody Movie movie) {
		return service.saveMovie(movie);
	}
	
	
	@GetMapping("/fetch")
	public ResponseEntity<ResponseStructure<Movie>>fetchById(@RequestParam int id){
		return service.fetchById(id);
	}
	
	
	

}
