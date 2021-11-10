package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static String[] countersList = new String[10];

    private static void randomiser() {
        String[] counters = new String[]{"Red", "Blue", "Yellow"};
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            countersList[i] = counters[random.nextInt(3)];
        }
        System.out.println(Arrays.toString(countersList));
    }

    public static void main(String[] args) {
        int points = 0;
        int life = 3;
        randomiser();
        System.out.println("Guess what the colours of the counters are:");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            String guess = input.next();
            if(guess.equalsIgnoreCase(countersList[i])){
                System.out.println("Correct");
                points+=2;
            }else{
                System.out.println("Wrong");
                life--;
                i--;
                points-=1;
            }
            if(life==0){
                System.out.println("You've lost");
                break;
            }
        }
        System.out.println(points);

    }


}
