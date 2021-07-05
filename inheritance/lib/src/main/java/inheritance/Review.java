package main.java.inheritance;

import main.java.inheritance.Behaviour.ReviewInterface;

import java.util.LinkedList;

public class Review implements ReviewInterface {
    private String body;
    private String author;
    private int numStars;

    public Review(String body, String author, int numStars) {
        this.body = body;
        this.author = author;
        this.numStars = numStars;
    }

    @Override
    public LinkedList<Review> getlist() {
        return null;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numStars=" + numStars +
                '}';
    }

    @Override
    public String getBody() {
       return this.body;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public int getStars() {
        return this.numStars;
    }
}
