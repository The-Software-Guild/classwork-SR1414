/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author srior
 */
public class YourLifeInMovies {
    public static void main(String[] args) {
        
        String userName;
        int userBirthYear;
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Let's play a game, What is your name? ");
        userName = userInput.nextLine();
        System.out.println("Ok, " + userName + ", What year were you born? ");
        userBirthYear = userInput.nextInt();
        System.out.println("Here are some movie facts: ");
        
        if (userBirthYear < 2005){
            System.out.println("Pixar's 'Up' came out over a decade ago.");
        }
        if (userBirthYear < 1995){
            System.out.println("The first Harry Potter came out over 15 years ago.");
        }
        if (userBirthYear < 1985){
            System.out.println("Space Jam came out not last decade, but the one before THAT.");
        }
        if (userBirthYear < 1975){
            System.out.println("The original Jurassic Park release is closer to the first lunar landing than it is to today.");
        }
        if (userBirthYear < 1965){
            System.out.println("The MASH TV series has been around for almost half a century!");
        }
        
        
        
    }
}
