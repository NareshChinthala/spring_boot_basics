package com.jsp.live_basics.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.live_basics.entity.Movie;

public interface Repo extends JpaRepository<Movie, Integer> {

}
