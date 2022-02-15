/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree;

import java.util.Scanner;

/**
 *
 * @author srior
 */
public class WindowMaster {
    public static void main(String [] args) {
    float height;
    float width;

    String stringHeight;
    String stringWidth;

    
    float areaOfWindow;
    float cost;
    float perimeterOfWindow;
    
    
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Please enter window height:");
    stringHeight = myScanner.nextLine();
    System.out.println("Please enter window width:");
    stringWidth = myScanner.nextLine();
    
    height = Float.parseFloat(stringHeight);
    width = Float.parseFloat(stringWidth);
    
    areaOfWindow = height * width;
        System.out.println("Area of the Window is: " + areaOfWindow);
    perimeterOfWindow = 2 * (height + width);
        System.out.println("Perimeter of the Window is: " + perimeterOfWindow);
    cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
        System.out.println("The cost of the Window is: £" + cost);
    
   
}
}
