package main.java.inheritance.Behaviour;

import main.java.inheritance.Review;

public interface TheaterInterface  {
    String getName();
    Review addRev (String body, String author, int stars);
}
