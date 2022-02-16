/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author srior
 */
public class MaybeItLovesMe {

    public static void main(String[] args) {
        
        Random randomPetals = new Random();
        int min = 18;
        int max = 89;
        int numOfPetals = randomPetals.nextInt(max - min + 1) + min;
        System.out.println(numOfPetals);
        boolean lovesME;
        System.out.println("Well here goes nothing...");
        do {
            System.out.println("It LOVES me!");
            numOfPetals--;
            lovesME = true;
            System.out.println("It loves me NOT!");
            numOfPetals--;
            lovesME = false;
        } while (numOfPetals >= 1);
        if (lovesME == true) {
            System.out.println("I knew it! It LOVES ME!");
        } else {
            System.out.println("I should have know! It doesn't love me");
        }
    }
}
