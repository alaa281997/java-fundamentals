package main.java.inheritance.Behaviour;

import main.java.inheritance.Review;

import java.util.LinkedList;

public interface RestaurantInterface {
    String getName();

    double getPrice();

    double getStars();


    void updateStars();

    LinkedList<Review> getLists();

    void addReview(Review review);

}
