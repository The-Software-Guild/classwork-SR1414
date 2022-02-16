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
public class GuessMeFinally {

    public static void main(String[] args) {

        Random randomNum = new Random();
        int min = -100;
        int max = 100;
        int storedInt = randomNum.nextInt((max - min) + 1) + min;
        int userInt;
        System.out.println(storedInt);
        System.out.println("I've chosen a number, Try and guess it: ");
        Scanner userInput = new Scanner(System.in);
        userInt = userInput.nextInt();
        System.out.println("Your Guess: " + userInt);
        /*if (userInt == storedInt) {
            System.out.println("Wow, nice guess! That was it!");
        }*/
        while (userInt == storedInt) {
            System.out.println("Wow, nice guess! That was it!");
            break;
        }

        while (userInt != storedInt) {
            while (userInt < storedInt) {
                System.out.println("Ha, nice try - too low!.");
                System.out.println("Try again: ");
                userInt = userInput.nextInt();
            }
            while (userInt > storedInt) {
                System.out.println("Too bad, too high.");
                System.out.println("Try again: ");
                userInt = userInput.nextInt();
            }
            while (userInt == storedInt) {
                System.out.println("Finally! It's about time you got it!");
                break;
            }

        }
        /*if (userInt < storedInt) {
            System.out.println("Ha, nice try - too low!.");
            System.out.println("Try again: ");
            userInt = userInput.nextInt();
            System.out.println("Your Guess: " + userInt);
            if (userInt == storedInt) {
                System.out.println("Wow, nice guess! That was it!");
            } else if (userInt < storedInt) {
                System.out.println("Ha, good attempt but still too low!.");
            } else if (userInt > storedInt) {
                System.out.println("Ha, good attempt but now it's too high!.");
            }
        }
        if (userInt > storedInt) {
            System.out.println("Too bad, way too high.");
            System.out.println("Try again: ");
            userInt = userInput.nextInt();
            System.out.println("Your Guess: " + userInt);
            if (userInt == storedInt) {
                System.out.println("Wow, nice guess! That was it!");
            } else if (userInt < storedInt) {
                System.out.println("Ha, good attempt but now it's too low!.");
            } else if (userInt > storedInt) {
                System.out.println("Ha, good attempt but still too high!.");
            }
        }*/
    }
}
