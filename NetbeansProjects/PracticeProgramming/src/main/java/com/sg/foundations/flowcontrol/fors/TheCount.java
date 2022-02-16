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
public class TheCount {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int startValue;
        int endValue;
        int incrementAmount;
        System.out.println("Enter the start value: ");
        startValue = userInput.nextInt();
        System.out.println("Enter the end value: ");
        endValue = userInput.nextInt();
        System.out.println("Enter the increment amount: ");
        incrementAmount = userInput.nextInt();
        int count = 0;
        
        
        System.out.println("*** I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU! ***");
        System.out.println("Start at: " + startValue);
        System.out.println("Stop at: " + endValue);
        System.out.println("Count by: " + incrementAmount);

        for (int i = startValue - 1; i < endValue; i++) {
             
            System.out.print((i + incrementAmount) + " ");
            count++;
            if (count == 3){
                System.out.print(" - Ah Ah Ah!\n");
                count = 0;
            }
        }

    }
}
