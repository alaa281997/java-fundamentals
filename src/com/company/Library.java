package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Library {
    public static void main(String[] args) {

        roll(4);
        int[][] arrr = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int x[] = {1,2,3,4,5,6};
       System.out.println("Result = "+ containsDuplicates(x));
        System.out.println("Avg = "+ average(x));
        System.out.println("The Avg = " + arrOfArr(arrr));
    }
    public static void roll(int n){
      int min=1,max=7;
        Random random = new Random();
        ArrayList<Integer> dice = new ArrayList<Integer>();
        for (int i = 0; i < n ; i++) {
           dice.add(random.nextInt(max-min)+1) ;

        }System.out.println(dice);



    }

    static boolean containsDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    return true;
                }
            }
        }
        return false;
    }

   static double average(int[] arrInt){
       double sum = 0;
        double avg = 0;
       for (int i = 0; i < arrInt.length; i++) {
           sum = sum +arrInt[i];
          avg = sum/arrInt.length;
       }
       return avg;
   }
 static int arrOfArr(int[][] arr){
    int min=0;
    for (int i = 0; i < arr.length; i++) {
        int sum = 0;
        for (int j = 0; j < arr[i].length; j++) {
            sum = arr[i][j] + 1;
            System.out.println(arr[i][j]);
        }
        int avg = sum/ arr[i].length;
        min = sum/arr[0].length;
        if(min>avg){
            min = avg;
        }

    }
   return  min;
}



}
