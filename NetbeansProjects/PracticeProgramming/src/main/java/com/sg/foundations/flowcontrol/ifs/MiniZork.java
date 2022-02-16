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
public class MiniZork {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {
            }
        } else if (action.equals("go to the house")) {
            System.out.println("\nThe front door is boarded shut");
            System.out.println("The boards look old and barely hanging on");
            action = userInput.nextLine();
            
            if (action.equals("Pull boards and enter house")){
                System.out.println("\nYou manage to pull the boards free and enter");
                System.out.println("you are now in the living room of the house");
                System.out.println("The furniture is dusty and rotting");
            }
            if (action.equals("go around the back")){
                System.out.println("\nyou go around the back of the house");
                System.out.println("you are standing in the overgrown garden");
                System.out.println("To the left is an old shed and the right is the back of the house");
                System.out.println("the back door is missing");
                action = userInput.nextLine();
                if (action.equals("go to the shed")){
                    System.out.println("\nthe shed is collapsed and nothing is inside");
                }
                if (action.equals("Enter back door")){
                    System.out.println("\nYou are standing in the kitchen in disrepair");
                }
            }
        }
    }
}
