package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

public class MovieController {
    private MovieService movieService = new MovieService();

    public void addUsingConsole() {
        System.out.println( "Quel est le titre du film ?" );
        Scanner scanner = new Scanner(System.in);
        String titre = scanner.nextLine();
        System.out.println( "Quel est le genre du film ?" );
        String genre = scanner.nextLine();
        Movie movie = new Movie();
        movie.setTitle(titre);
        movie.setGenre(genre);
        movieService.registerMovie(movie);
    }
}
