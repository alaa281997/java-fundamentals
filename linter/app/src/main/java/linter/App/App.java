/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package main.java.linter.App;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws IOException {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

       analyzingWeatherData(weeklyMonthTemperatures);

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");


        System.out.println( tally(votes) + " received the most votes!");



        Path path = Paths.get("C:\\Users\\User\\IdeaProjects\\java-fundamentals2\\linter\\app\\src\\main\\resources\\gates.js");
        new App().file(path.toString());
        System.out.println(path.toString());
    }

    public static void analyzingWeatherData(int[][] arr){
        HashSet<Integer> set=new HashSet<Integer>();
        for (int i = 0; i < arr.length ; i++) {
            for(Integer degree : arr[i]){
                set.add(degree);
            }

        }
        System.out.println("The min degree "+Collections.min(set));
        System.out.println("The max degree " + Collections.max(set));

        for(int i = Collections.min(set); i <= Collections.max(set);i++ ){
            if( !set.contains(i)){
                System.out.println("Never Saw" + i);
            }
        }

    }

    public static String tally(List<String> votes){
        int vote;
        int max=0;
        String winner = "";

        for (int i = 0; i < votes.size(); i++) {
            vote = 0;
            for (int j = 0; j < votes.size(); j++) {
                if (votes.get(i).equals(votes.get(j))) {
                  vote++;

                }
            }
            if (vote > max){
                max = vote;
                winner = votes.get(i);
            }

        }
        return winner;

    }
       public static int file(String path) throws IOException{
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(path)));
        int errorLine = 0;
        int error = 0;
        String line = "";
        try {
            while (scanner.hasNext()) {
                line = scanner.nextLine();
                if(!line.endsWith(";") && !line.isEmpty() &&
                        !line.endsWith("{")
                        &&
                        !line.endsWith("}") &&
                        !line.contains("if") &&
                        !line.contains("else")
                ) {
                    error++;
                    System.out.println(++errorLine + " Missing semicolon.");
                }
                else {
                    errorLine++;
                }
            }
        }

        catch (Exception e) {
            System.out.println(e);
        }

        finally {
            scanner.close();
        }

        return error;
    }


}
