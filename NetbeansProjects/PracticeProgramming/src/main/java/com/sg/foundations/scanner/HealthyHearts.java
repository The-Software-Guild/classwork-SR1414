/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author srior
 */
public class HealthyHearts {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        int age = 0;
        int bpm = 0;
        
        System.out.println("What is your age? ");
        age = Integer.parseInt(userInput.nextLine());
        bpm = 220 - age;
        
        System.out.println("Your maximum heart beat should be " + bpm + " per minute.");
        
        System.out.println("Your target HR zone is " + ((bpm/100)*50) + " - " + ((bpm/100)*85) + " per minute.");
    }
}
