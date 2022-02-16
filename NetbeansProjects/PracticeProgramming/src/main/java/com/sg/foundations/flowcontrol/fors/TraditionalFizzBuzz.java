/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author srior
 */
public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int userNum = userInput.nextInt();
        
        for(int i = 0; i <= userNum; i++){
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("fizz buzz");
            }else if ((i % 5 == 0)){
                System.out.println("buzz");
            }else if ((i % 3 == 0)){
                System.out.println("fizz");
            }else{
                System.out.println(i);
            }
        }
        System.out.println("TRADITION!!!!!");
    }
}
