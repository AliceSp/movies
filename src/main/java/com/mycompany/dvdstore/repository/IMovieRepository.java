package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

public interface IMovieRepository {

    void add(Movie movie);
}
