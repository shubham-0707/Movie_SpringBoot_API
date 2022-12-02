package com.example.Movie;

public class Movie {
    private String name;
    private int movieRunTime;
    private double imdbRating;

    Movie(){

        this.name = "movie_not_found";
        this.movieRunTime = 0;
        this.imdbRating = 0.0;

    }

    Movie(String name , int movieRunTime , double imdbRating){
        this.name = name;
        this.movieRunTime = movieRunTime;
        this.imdbRating = imdbRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMovieRunTime() {
        return movieRunTime;
    }

    public void setMovieRunTime(int movieRunTime) {
        this.movieRunTime = movieRunTime;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }
}
