/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author srior
 */
public class StayPositive {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number to countdown from: ");

        int countdown = userInput.nextInt();
        if ((countdown % 2) == 0) {
            while (countdown != -1) {
                System.out.println(countdown);
                if (countdown == 0) {
                    System.out.println("BLAST OFF!");
                }
                countdown--;
            }
        } else {
            System.out.println("You must enter a positive number");
        }

    }
}
