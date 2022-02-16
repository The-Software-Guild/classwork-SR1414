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
public class WaitAWhile {
     public static void main(String[] args) {

        int timeNow = 5;
        int bedTime = 10;

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            //timeNow++; // Time passes
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
}
//Changin bedTIme from 10 to 11 changes the 10 o'clock line to say "just a little longer" and adds a new line for 11 o'clock to go to bed.
//Keeping bedTime 10 and changing timeNow to 11 just print 11 o'clock as bed time.
//commenting out timeNow++ add the end of the loop cause the loop to continue endlessly