package com.jsp.live_basics.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.live_basics.entity.Image;

public interface ImageRepo extends JpaRepository<Image, Long>{
	

}
