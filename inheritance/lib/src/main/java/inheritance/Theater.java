package main.java.inheritance;

import main.java.inheritance.Behaviour.TheaterInterface;

import java.util.*;

public class Theater implements TheaterInterface {
    private String name;
    private LinkedList<String> movies = new LinkedList<>();
    private Map<String , Review> reviews = new HashMap<>();
    public Map<String, Review> getReviews() {
        return reviews;
    }
    public Theater(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public Review addRev(String body, String author, int stars) {
        Review newReview = new Review(body, author, stars);
        return newReview;
    }
    public void addMovie(String movieTitle) {
        this.movies.add(movieTitle);
    }
    public LinkedList<String> getMovies() {
        return this.movies;
    }
    public void removeMovie(String movieTitle) {
        this.movies.remove(movieTitle);
    }
    public void addRev(Review rev, String movieName) {
        if(movies.contains(movieName)) {
            reviews.put(movieName , rev);
            System.out.println("The movie name added to review");
        }else{
            System.out.println("Movie doesn't exist");
        }
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies" + movies +
                ", reviews=" + reviews +
                '}';
    }
}

