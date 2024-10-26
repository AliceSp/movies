package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class MovieController {
    @Autowired
    private IMovieService movieServiceInterface;

    public IMovieService getMovieServiceInterface() {
        return movieServiceInterface;
    }

    public void setMovieServiceInterface(IMovieService movieServiceInterface) {
        this.movieServiceInterface = movieServiceInterface;
    }

    public void addUsingConsole() {
        System.out.println( "Quel est le titre du film ?" );
        Scanner scanner = new Scanner(System.in);
        String titre = scanner.nextLine();
        System.out.println( "Quel est le genre du film ?" );
        String genre = scanner.nextLine();
        Movie movie = new Movie();
        movie.setTitle(titre);
        movie.setGenre(genre);
        movieServiceInterface.registerMovie(movie);
    }
}
