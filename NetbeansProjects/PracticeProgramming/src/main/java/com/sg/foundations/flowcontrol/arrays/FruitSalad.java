/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.arrays;

import java.util.Arrays;

/**
 *
 * @author srior
 */
public class FruitSalad {

    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple", "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        int numOfIngredients = 0;
        int numOfApples = 0;
        int numOfOrange = 0;
        String[] fruitSalad = new String[12];
        for (int i = 0; i < fruit.length; i++) {
            if ((isBerry(fruit[i])) && (numOfIngredients != 7)) {
                fruitSalad[numOfIngredients] = fruit[i];
            }

        }
        System.out.println(Arrays.toString(fruitSalad));
        // Code Recipe for fruit salad should go here!
    }

    public static boolean isBerry(String x) {

        switch (x) {
            case "Gooseberry":
                return true;
            case "Blueberry":
                return true;
            case "Strawberry":
                return true;
            case "Raspberry":
                return true;
            case "Blackberry":
                return true;
            case "Snozzberry":
                return true;
            case "Banana":
                return true;
            default:
                return false;
        }

    }

    public static boolean isApple(String x) {

        switch (x) {
            case "Gala Apple":
                return true;
            case "Granny Smith Apple":
                return true;
            case "Braeburn Apple":
                return true;
            case "Pink Pearl Apple":
                return true;
            case "Fuji Apple":
                return true;
            case "Kiku Apple":
                return true;
            default:
                return false;
        }

    }

    public static boolean isOrange(String x) {

        switch (x) {
            case "Navel Orange":
                return true;
            case "Blood Orange":
                return true;
            case "Florida Orange":
                return true;
            case "Satsuma Orange":
                return true;
            default:
                return false;
        }

    }

    public static boolean isTomato(String x) {

        switch (x) {
            case "Cherry Tomato":
                return true;
            case "Beefsteak Tomato":
                return true;
            case "Sungold Tomato":
                return true;
            default:
                return false;
        }

    }

    public static boolean isOtherFruit(String x) {

        switch (x) {
            case "Kiwi Fruit":
                return true;
            case "Pineapple":
                return true;
            case "Mango":
                return true;
            case "Watermelon":
                return true;
            default:
                return false;
        }

    }
}
