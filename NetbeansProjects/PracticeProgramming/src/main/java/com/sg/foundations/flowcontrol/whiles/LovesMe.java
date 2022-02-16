/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author srior
 */
public class LovesMe {

    public static void main(String[] args) {
        int numOfPetals = 34;
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
