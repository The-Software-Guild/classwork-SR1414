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
public class GuessMe {
    public static void main(String[] args) {
        int storedInt = 53;
        int userInt;
        System.out.println("I've chosen a number, Try and guess it: ");
        Scanner userInput = new Scanner(System.in);
        userInt = userInput.nextInt();
        System.out.println("Your Guess: " + userInt);
        if (userInt == storedInt) {
            System.out.println("Wow, nice guess! That was it!");
        }
        if (userInt < storedInt) {
            System.out.println("Ha, nice try - too low! I chose " + storedInt + ".");
        }
        if (userInt > storedInt) {
            System.out.println("Too bad, way too high. I chose " + storedInt + ".");
        }
    }
}
