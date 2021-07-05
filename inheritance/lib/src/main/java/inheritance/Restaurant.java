package main.java.inheritance;

import main.java.inheritance.Behaviour.RestaurantInterface;

import java.util.LinkedList;

public class Restaurant implements RestaurantInterface {
    private String Name;
    private double stars;
    private double price;
    private LinkedList<Review> lists = new LinkedList<>();

    public Restaurant(String name, double stars,double price) {
        Name = name;
        this.stars = stars;
        this.price = price;
    }

    public LinkedList<Review> getLists() {
        return lists;
    }

    @Override
    public void addReview(Review review) {
        this.lists.add(review);
         updateStars();
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "Name='" + Name + '\'' +
                ", rate=" + stars +
                ", price=" + price +
                '}';
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public double getStars() {
        return this.stars;
    }


    @Override
    public String getName() {
        return this.Name;
    }



    @Override
    public void updateStars() {
        int avg = 0;
        for (int i=0; i < getLists().size(); i++) {
            avg += getLists().get(i).getStars();
        }
        avg = avg/(getLists().size());
        avg = Math.round(avg);
        this.stars = avg;
    }

}

