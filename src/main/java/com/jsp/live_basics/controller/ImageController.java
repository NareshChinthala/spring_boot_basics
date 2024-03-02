package com.jsp.live_basics.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jsp.live_basics.entity.Image;
import com.jsp.live_basics.service.ImageService;

@RestController
public class ImageController {

	@Autowired
	ImageService service;

	@PostMapping("/upload")
	public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
		try {
			Image image = new Image();
			image.setImageName(file.getOriginalFilename());
			image.setImg(file.getBytes());

			service.saveImage(image);

			return ResponseEntity.ok("Image uploaded successfully!");
		} catch (IOException e) {
			e.printStackTrace();
			return ResponseEntity.status(500).body("Error uploading image");
		}
	}
}
