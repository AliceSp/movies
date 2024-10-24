package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.IMovieRepository;

public class MovieService  implements IMovieService{

    public IMovieRepository getMovieRepositoryInterface() {
        return movieRepositoryInterface;
    }

    public void setMovieRepositoryInterface(IMovieRepository movieRepositoryInterface) {
        this.movieRepositoryInterface = movieRepositoryInterface;
    }

    private IMovieRepository movieRepositoryInterface;
    public void registerMovie(Movie movie){
        movieRepositoryInterface.add(movie);
    }
}
