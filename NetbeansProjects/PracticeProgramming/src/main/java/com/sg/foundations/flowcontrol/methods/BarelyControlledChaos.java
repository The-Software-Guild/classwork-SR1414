/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

/**
 *
 * @author srior
 */
public class BarelyControlledChaos {

    public static void main(String[] args) {
         String color =  pickColour(); // call color method here
         String animal =  randomAnimal(); // call animal method again here
         String colorAgain = pickColour(); // call color method again here
         int weight =  numberInRange(5, 200); // call number method,
        // with a range between 5 - 200
         int distance =  numberInRange(10, 20); // call number method,
        // with a range between 10 - 20
         int number =  numberInRange(10000, 20000); // call number method,
        // with a range between 10000 - 20000
         int time =  numberInRange(2, 6); // call number method,
        // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }
    
    public static String pickColour(){
        String[] colours = {"Red", "Blue", "Green", "Yellow", "Purple"};
        Random rand = new Random();
        int max = 5;
        int min = 0;
        return colours[rand.nextInt(max - min) + min];
    }
    public static String randomAnimal(){
        String[] animals = {"Gorilla", "Wolf", "Elephant", "Toucan", "Tuna"};
        Random rand = new Random();
        int max = 5;
        int min = 0;
        return animals[rand.nextInt(max - min) + min];
    }
    public static int numberInRange(int x, int y){
        Random rand = new Random();
        int max = y - 1;
        int min = x + 1;
        return rand.nextInt(max - min) + min;
    }

    // ??? Method 1 ???
    // ??? Method 2 ???
    // ??? Method 3 ???
}
