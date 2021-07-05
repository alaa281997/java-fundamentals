package main.java.inheritance;


import main.java.inheritance.Behaviour.ShopInterface;

import java.util.LinkedList;

public class Shop implements ShopInterface {
   private String name;
   private String description;
   private int numberOfSings;
   private LinkedList<Review> lists = new LinkedList<>();

    public Shop(String name, String description, int numberOfSings) {
        this.name = name;
        this.description = description;
        this.numberOfSings = numberOfSings;
    }


    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberOfSings=" + numberOfSings +
                '}';
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int getNumberOfSings() {
        return this.numberOfSings;
    }

    @Override
    public LinkedList<Review> getlist() {
        return lists;
    }

    @Override
    public void updateStars() {
        int avg = 0;
        for (int i=0; i < getlist().size(); i++) {
            avg += getlist().get(i).getStars();
        }
        avg = avg/(getlist().size());
        avg = Math.round(avg);
        this.numberOfSings = avg;
    }


    @Override
    public void addReview(Review review) {
        this.lists.add(review);
        updateStars();
    }
}
