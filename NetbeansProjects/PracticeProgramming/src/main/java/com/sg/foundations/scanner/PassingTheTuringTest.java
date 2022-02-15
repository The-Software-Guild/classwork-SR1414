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
public class PassingTheTuringTest {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        String name, colour, food;
        double num;
        System.out.println("What is your name? ");
        name = inputReader.nextLine();
        
        System.out.println("\nHello " + name + ", My Name is Turing");
        System.out.println("What is your favourite colour?");
        colour = inputReader.nextLine();
        System.out.println("\n" + colour + "? How vanilla, Mine is Gray\n");
        System.out.println("\nWhat is your favourite food? \n");
        food = inputReader.nextLine();
        System.out.println("\n" + food + "? interesting, now input a number\n");
        num = Double.parseDouble(inputReader.nextLine());
        System.out.println("\nI have taken enough information, Goodbye\n");
    }
    
}
