package com.estudos.movies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.movies.entities.Genre;
import com.estudos.movies.services.GenreService;

@RestController
@RequestMapping(value = "/genres")
public class GenreController {
	
	@Autowired
	private GenreService service;
	
	@GetMapping
	public ResponseEntity<List<Genre>> findAll(){
		List<Genre> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
		
}
