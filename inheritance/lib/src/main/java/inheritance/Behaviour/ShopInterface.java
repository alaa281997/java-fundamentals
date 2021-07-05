package main.java.inheritance.Behaviour;


import main.java.inheritance.Review;

import java.util.LinkedList;

public interface ShopInterface {
    String getName();
    String getDescription();
    int getNumberOfSings();

    LinkedList<Review> getlist();
    void updateStars();
    void addReview(Review review);
}
