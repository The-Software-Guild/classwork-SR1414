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
public class AllTheTrivia {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String q1, q2, q3, q4;
        
        System.out.println("What unit is equivalent to 1,024 Gigabytes?");
        q1 = userInput.nextLine();
        
        System.out.println("Which planet is the only one that rotates clockwise in our Solar System? ");
        q2 = userInput.nextLine();
        
        System.out.println("The largest volcano ever discovered in our Solar System is located on which planet? ");
        q3 = userInput.nextLine();
        
        System.out.println("What is the most abundant element in the earth's atmosphere? ");
        q4 = userInput.nextLine();
        
        System.out.println("\n\nWow, 1,024 Gigabytes is a " + q1);
        System.out.println("I didn't know that the largest ever volcano was discovered on ");
        System.out.println("That's amazing that " + q3 +" is the most abundant element in the atmosphere...");        
        System.out.println(q4 + " is the only planet that rotates clockwise, neat!");      
        
        
        
    }
}
