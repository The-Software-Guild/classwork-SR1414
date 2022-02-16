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
public class LazyTeenager {
    public static void main(String[] args) {
        
        Random rand = new Random();
        int min = 1;
        int max = 100;
        int cleanChance;
        int cleanChancePercenatage = 10;
        boolean isRoomClean = false;
        int timesAsked = 1;
        
        do {
            System.out.println("Clean your room!! (x" + timesAsked + ")");
            cleanChancePercenatage = cleanChancePercenatage + 10;
            cleanChance = rand.nextInt((max - min) + 1) + min;
            timesAsked++;
            if (timesAsked == 7){
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX");
                break;            }
            if (cleanChance < cleanChancePercenatage){
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                break;
            }
        } while (isRoomClean == false);
    }
}
