/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

/**
 *
 * @author srior
 */
public class AllAboutme {
    public static void main(String[] args) {
    
        String myName = "Sean Riordan";
        String favouriteFood = "Pie"; 
        String homeType[] = {"Dorm", "Apartment", "House", "Something Else"};
        int numberOfPets = 3;
        boolean canWhistle = true;
        System.out.println("My name is " + myName + ".");
        System.out.println("My favourite food is " + favouriteFood + ".");
        System.out.println("I have " + numberOfPets + " pets.");
        System.out.println("I live in a " + homeType[2] + " that is expensive.");
        System.out.println("It is " + canWhistle + ", i can whistle.");
    }
}
