/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author srior
 */
public class BewareTheKraken {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        String leave;
        int min = 0;
        int max = 2;
        Random rand = new Random();
        String[] fish = {"Shark", "Dolphin", "Barracuda"};
        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;

        // Turns out the ocean is only so deep, 36200 at the deepest survey,
        // so if we reach the bottom ... we should probably stop.
        while (depthDivedInFt < 36200) {
            System.out.println("So far, we've swum " + depthDivedInFt + " feet");
            System.out.println("I can see a " + fish[rand.nextInt((max - min) + 1) + min]);
            System.out.println("Do you want to leave (y/n)? ");
            leave = userInput.nextLine();
            
            while (leave.equals("y")){
                System.out.println("You got back to the Surface");
                depthDivedInFt = 0;
                break;
            }
            
            if (depthDivedInFt >= 20000) {
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                
                System.out.println("TIME TO GO!");
                break;
            }

            // I can swim, really fast! 500ft at a time!
            depthDivedInFt += 1000;
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
}
