package com.example.Movie;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Component
public class MovieRepository {

    Map<String , Movie > movie_hash = new HashMap<>();

    public void addMovieToDB(Movie movie){
        movie_hash.put(movie.getName() , movie);
    }

    public Movie getMovieFromDB(String name){
        if(movie_hash.containsKey(name)){
            return movie_hash.get(name);
        }
        return new Movie();
    }

    public void updateMovieInDB(Movie movie){
        if(movie_hash.containsKey(movie.getName())){
            movie_hash.put(movie.getName(), movie);
        }
    }

    public void deleteMovieFromDB(String name){
        if(movie_hash.containsKey(name)){
            movie_hash.remove(name);
        }
    }

    public List<Movie> getAllMoviesFromDB(){
        List<Movie> ans = new ArrayList<>();

        for(Movie movie : movie_hash.values()){
            ans.add(movie);
        }

        return ans;
    }

}
