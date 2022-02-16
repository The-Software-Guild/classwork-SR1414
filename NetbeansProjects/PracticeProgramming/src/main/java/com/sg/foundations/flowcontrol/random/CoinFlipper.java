/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author srior
 */
public class CoinFlipper {
    public static void main(String[] args) {
        
        Random coin = new Random();
        System.out.println(coin);
        boolean result = coin.nextBoolean();
        
        System.out.println("Ready, Set, Flip....!!");
        if (result == true){
            System.out.println("You got HEADS!");
        }else if (result == false) {
            System.out.println("You got TAILS!");
        }
        
    }
    
        
}
