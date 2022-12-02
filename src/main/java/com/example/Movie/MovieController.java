package com.example.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/get-movie/{name}")
    public ResponseEntity<Movie> getMovies(@PathVariable String name){
        Movie movie  = movieService.getMovieService(name);
        return new ResponseEntity<>(movie, HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-all-movies")
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<>(movieService.getAllMovies() , HttpStatus.ACCEPTED);
    }



    @PostMapping("/add-movie")
    public ResponseEntity<String> addMovie(@RequestBody Movie movie){
        movieService.addMovieService(movie);
        return new ResponseEntity("Movie successfully added " , HttpStatus.ACCEPTED);
    }


    @PutMapping("/update-movie")
    public ResponseEntity<String> updateMovie(@RequestBody Movie movie){
        movieService.updateMovieService(movie);
        return new ResponseEntity("movie successfully updated" , HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete-movie/{name}")
    public ResponseEntity<String> deleteMovie(@PathVariable String name){
        movieService.deleteMovieService(name);
        return new ResponseEntity<>("movie deleted successfully" , HttpStatus.ACCEPTED);
    }

}
