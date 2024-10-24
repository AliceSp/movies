package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.service.MovieService;

public class App 
{
    public static void main( String[] args )
    {
        GoLiveMovieRepository repository = new GoLiveMovieRepository();
        MovieService movieService = new MovieService();
        movieService.setMovieRepositoryInterface(repository);
        MovieController movieController = new MovieController();
        movieController.setMovieServiceInterface(movieService);
        movieController.addUsingConsole();

    }
}
