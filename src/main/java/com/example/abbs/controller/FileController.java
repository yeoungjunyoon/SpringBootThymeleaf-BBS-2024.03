package com.example.abbs.controller;

import jakarta.annotation.Resource;

import java.net.http.HttpHeaders;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/file")
public class FileController {
	@Value("${spring.servlet.multipart.location}") private String uploadDir;
	
	@GetMapping("/profile/{filename}")
	   public ResponseEntity<Resource> profile(@PathVariable String filename) {
	      Path path = Paths.get(uploadDir + "profile/" + filename);
	      try {
	         String contentType = Files.probeContentType(path);
	         HttpHeaders headers = new HttpHeaders();
	         headers.setContentDisposition(
	               ContentDisposition.builder("attachment")
	                              .filename(filename, StandardCharsets.UTF_8)
	                              .build()
	               );
	         headers.add(HttpHeaders.CONTENT_TYPE, contentType);
	         Resource resource = new InputStreamResource(Files.newInputStream(path));
	         return new ResponseEntity<>(resource, headers, HttpStatus.OK);
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      return null;
	}
}



