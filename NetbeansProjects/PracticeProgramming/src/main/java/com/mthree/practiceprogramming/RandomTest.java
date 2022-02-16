/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.practiceprogramming;

import java.util.Random;

/**
 *
 * @author srior
 */
public class RandomTest {

    public static void main(String[] args) {
        Random rng = new Random();
// generate 10 numbers, each between 0 and 9
        for (int i = 0; i <= 10; i++) {
            int randomNumber = rng.nextInt(10);
            System.out.println(randomNumber);
        }
    }
}
