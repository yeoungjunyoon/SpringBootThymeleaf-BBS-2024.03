package com.example.abbs.controller;

import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/file")
public class FileController {
	
	@GetMapping("/profile/{filername}")
	public ResponseEntity<Resource> profile(@PathVariable String filename) {
		
		return null;
	}
	
	@GetMapping("/download/{filename}")
	public ResponseEntity<Resource> download(@PathVariable String filename) {
		
		return null;
	}

}

