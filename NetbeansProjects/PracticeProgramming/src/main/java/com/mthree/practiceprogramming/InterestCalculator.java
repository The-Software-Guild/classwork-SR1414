/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.practiceprogramming;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author srior
 */
/*John has $500 to invest. Sue knows of a mutual fund plan that pays 10% interest annually, 
compounded quarterly. That is, every three months, the principal is multiplied by 2.5% 
(the 10% annual rate divided by 4 because it is compounded 4 times per year) and 
        the result is added to the principal.*/
public class InterestCalculator {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double annualInterestRate;
        double initialAmountOfPrincipal;
        int numOfYearsInFund;
        int year = 1;
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("What is the annual interest rate? (%) ");
        annualInterestRate = userInput.nextDouble();
        double QuarterlyInterestRate = annualInterestRate / 4;

        System.out.println("What is the initial amount of principal? (£)");
        initialAmountOfPrincipal = userInput.nextDouble();

        System.out.println("How many years is the money to stay in the fund? ");
        numOfYearsInFund = userInput.nextInt();

        System.out.println("Calculating...");
        double currentBalance = initialAmountOfPrincipal;
        
        while (year != numOfYearsInFund) {
            
            double perQuarter = ((currentBalance * (1 + ((QuarterlyInterestRate) / 100))) - currentBalance);
            double newBalance;
            
            if (year == 1) {
                newBalance = getNewBalance(currentBalance, perQuarter);
                System.out.println("Year 1: ");
                System.out.println("Began with £" + df.format(currentBalance));
                System.out.println("Earned £" + df.format((perQuarter * 4)));
                System.out.println("Ended with £" + df.format(newBalance));
                currentBalance = newBalance;
                year++;
            }
            if (year != 1){
                newBalance = getNewBalance(currentBalance, perQuarter);
                System.out.println("Year " + year + ": ");
                System.out.println("Began with £" + df.format(currentBalance));
                System.out.println("Earned £" + df.format((perQuarter * 4)));
                System.out.println("Ended with £" + df.format(newBalance));
                currentBalance = newBalance;
                year++;
            }

        }

    }
    
    public static double getNewBalance(double x, double y){
        double balance = x;
        double perAnum = y*4;
        double newBalance = balance + perAnum;
        return newBalance;
        
    }

}
