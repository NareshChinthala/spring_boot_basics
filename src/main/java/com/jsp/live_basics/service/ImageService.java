package com.jsp.live_basics.service;

import javax.imageio.ImageReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.live_basics.entity.Image;
import com.jsp.live_basics.repo.ImageRepo;

@Service
public class ImageService {
	
	@Autowired
	ImageRepo repo;
	
	public Image saveImage(Image image) {
		return repo.save(image);
	}

}
