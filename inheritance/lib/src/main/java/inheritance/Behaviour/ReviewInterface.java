package main.java.inheritance.Behaviour;

import main.java.inheritance.Review;

import java.util.LinkedList;

public interface ReviewInterface {


    String getBody();
    String getAuthor();
    int getStars();

    LinkedList<Review> getlist();
}
