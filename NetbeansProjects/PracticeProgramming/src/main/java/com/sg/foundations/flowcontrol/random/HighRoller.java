/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author srior
 */
public class HighRoller {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What side dice do you want to roll? ");
        int numberOfSides = userInput.nextInt();
        if (numberOfSides == 0){
        numberOfSides++;
        }
        Random diceRoller = new Random();

        int rollResult = diceRoller.nextInt(numberOfSides) + 1;

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("You rolled a D" + numberOfSides);
        System.out.println("I rolled a " + rollResult);
        if (rollResult == numberOfSides){
            System.out.println("You rolled a critical! Nice job!");
        }
        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        }
    }
}
