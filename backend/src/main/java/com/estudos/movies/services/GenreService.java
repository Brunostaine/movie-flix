package com.estudos.movies.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.movies.entities.Genre;
import com.estudos.movies.repositories.GenreRepository;

@Service
public class GenreService {
	
		@Autowired
		private GenreRepository repository;
		
		public List<Genre> findAll() {
			return repository.findAll();	
		}
}
