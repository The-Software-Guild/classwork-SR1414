package com.mthree.assessments;

import java.util.Random;
import java.util.Scanner;

public class LuckySevens {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int userMoney = 0;
        int numOfRolls = 0;
        int maxAmountOfMoney = 0;
        int rollsAtHighestAmount = 0;
        int compRoll = 0;

        System.out.println("How many dollars do you have? ");
        userMoney = userInput.nextInt();

        while (userMoney != 0) {

            compRoll = rollDice();

            if (compRoll == 7) {
                userMoney += 4;
                numOfRolls++;
            } else {
                userMoney -= 1;
                numOfRolls++;
            }
            if (maxAmountOfMoney < userMoney){
            maxAmountOfMoney = userMoney;
            rollsAtHighestAmount = numOfRolls;
                //System.out.println(maxAmountOfMoney);
                //System.out.println(rollsAtHighestAmount);
            }
            if (userMoney <= 0){
                System.out.println("You are broke after " + numOfRolls + " rolls.");
                System.out.println("You should have quit after " + rollsAtHighestAmount + " rolls when you had $" + maxAmountOfMoney);
            }

        }

    }

    public static int rollDice() {
        int min = 1;
        int max = 7;
        int dice1 = 0;
        int dice2 = 0;
        Random rand = new Random();
        dice1 = rand.nextInt(max - min) + min;
        dice2 = rand.nextInt(max - min) + min;
        return dice1 + dice2;
    }

}
