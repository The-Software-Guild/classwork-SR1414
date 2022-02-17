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

        System.out.println("What is the annual interest rate? (%) ");
        annualInterestRate = userInput.nextDouble();
        double QuarterlyInterestRate = annualInterestRate / 4;

        System.out.println("What is the initial amount of principal? (£)");
        initialAmountOfPrincipal = userInput.nextDouble();

        System.out.println("How many years is the money to stay in the fund? ");
        numOfYearsInFund = userInput.nextInt();

        System.out.println("Calculating...");

        //System.out.println(currentBalance);
        for (int i = 1; i < numOfYearsInFund; i++) {
            double perQuarter;
            double annual;
            double currentBalance;
            double newBalance;
            if (year == 1) {
                currentBalance = initialAmountOfPrincipal;
                perQuarter = ((currentBalance * (1 + ((QuarterlyInterestRate) / 100))) - currentBalance);
                annual = perQuarter * 4;
                newBalance = currentBalance + annual;
                System.out.println("------------------------------------------");
                System.out.println("Year 1: ");
                System.out.println("Began with £" + currentBalance);
                System.out.println("Earned £" + annual);
                System.out.println("Ended with £" + newBalance);
                year++;
            } else {
                perQuarter = ((currentBalance * (1 + ((QuarterlyInterestRate) / 100))) - currentBalance);
                annual = perQuarter * 4;
                System.out.println("------------------------------------------");
                System.out.println("Year 1: ");
                System.out.println("Began with £" + currentBalance);
                System.out.println("Earned £" + annual);
                System.out.println("Ended with £" + newBalance);
                currentBalance = newBalance;
                year++;
            }
        }

    }

    /*while (year != numOfYearsInFund) {
            if (year == 1) {
                System.out.println("Year 1: ");
                System.out.println("Began with £" + initialAmountOfPrincipal);
                System.out.println("Earned £" + (perQuarter * 4));
                System.out.println("Ended with £" + (currentBalance + (perQuarter * 4)));
                year++;
            }
            perQuarter = ((currentBalance * (1 + ((QuarterlyInterestRate) / 100))) - currentBalance);
            //double currentBalance = current
            //System.out.println(perQuarter);
            System.out.println("Year " + year + ": ");
            System.out.println("Began with £" + initialAmountOfPrincipal);
            System.out.println("Earned £" + (perQuarter * 4));
            System.out.println("Ended with £" + (currentBalance + (perQuarter * 4)));
            year++;
        }*/
}
}
