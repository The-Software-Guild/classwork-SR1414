/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.practiceprogramming;

import java.util.Scanner;

/**
 *
 * @author srior
 */
public class Factorizer {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What number would you like to factor? ");
        int num = userInput.nextInt();
        int factor = 1;
        int sum = 0;
        int numOfFactors = 0;
        System.out.println("The Factors of 6 Are: ");
        while (factor <= num) {
            if (num % factor == 0) {
                if(factor != num){
                sum += factor;
                } 
                System.out.println(factor);
                numOfFactors++;
            }
            factor++;
        }
        System.out.println(num + " has " + numOfFactors + " factors");
        if (numOfFactors == 2) {
            System.out.println(num + " is a prime number!");
        } else{
            System.out.println(num + " is not a prime number");
        }
        if(sum == num){
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }

    }
}
