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
public class ForTimes {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = userInput.nextInt();
        
        for (int i = 1; i < 15; i++) {
            System.out.println(i + " * " + num + " is: " + (i*num));
        }
    }
}
