package com.example.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public void addMovieService(Movie movie){
        movieRepository.addMovieToDB(movie);
    }

    public Movie getMovieService(String name){
        return movieRepository.getMovieFromDB(name);
    }

    public void updateMovieService(Movie movie){
        movieRepository.updateMovieInDB(movie);
    }

    public void deleteMovieService(String name){
        movieRepository.deleteMovieFromDB(name);
    }

    public List<Movie> getAllMovies(){
        return movieRepository.getAllMoviesFromDB();
    }

}
