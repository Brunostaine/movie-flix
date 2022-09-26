package com.estudos.movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudos.movies.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
