/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author srior
 */
public class ForTimesFor {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = userInput.nextInt();
        int userScore = 0;
        int userAnswer;
        
        for (int i = 1; i < 16; i++) {
            System.out.println(i + " * " + num + " is? ");
            userAnswer = userInput.nextInt();
            if (userAnswer == (i*num)){
                System.out.println("Correct!");
                userScore++;
            } else {
                System.out.println("Incorrect!, the answer is :" + (i*num));
                userScore--;
            }
            
        }
        
        System.out.println("Final Score is: " + userScore + "/15");
        System.out.println(((userScore*100)/15) < 50);
        if(((userScore*100)/15) < 50) {
            System.out.println("YOU MUST STUDY MORE");
        } else if (((userScore*100)/15) >= 90){
            System.out.println("CONGRADULATION, YOU ARE SMART");
        }
    }
}
