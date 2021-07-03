package com.company;
import java.util.ArrayList;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    }

    public static String pluralize(String name,int num){
        if(num > 1 || num == 0){
            return name + "s";
        }else {
            return name;
        }
    }

    public static void flipNHeads(int n){
        int fliping=0, heads = 0;
        double coin;
        Random random = new Random();
        while (heads < n) {
            coin = random.nextDouble();
            if (coin < 0.5) {
                System.out.println("Tail");
                fliping = fliping + 1;
                heads = 0;
            } else {
                System.out.println("Head");
                heads = heads + 1;
            }
            fliping = fliping + 1;

        }
     }

     public static void clock(){
        int counter = 0;
         for ( ; ; ){
            LocalDateTime now = LocalDateTime.now();

            int second = now.getSecond();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            if(counter != second) {
                System.out.println("time is "+time);
                counter = second;
            }
        }
     }


}
