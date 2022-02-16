/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author srior
 */
public class FieldDay {
    public static void main(String[] args) {
        String[] teamNames = {"Red Dragons", "Dark Wizards", "Moving Castle", "Golden Snitches", "Night Guards", "Black Holes"};
        String lastName;
        String userTeam = "No Team";
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your last name? ");
        lastName = userInput.nextLine();
        
        if ((lastName.compareTo("Baggins") < 0)) {
            userTeam = teamNames[0];
        }
        if ((lastName.compareTo("Baggins") > 0 && lastName.compareTo("Dresden") < 0)) {
            userTeam = teamNames[1];
        }
        if ((lastName.compareTo("Dresden") > 0 && lastName.compareTo("Howl") < 0)) {
            userTeam = teamNames[2];
        }
        if ((lastName.compareTo("Howl") > 0 && lastName.compareTo("Potter") < 0)) {
            userTeam = teamNames[3];
        }
        if ((lastName.compareTo("Potter") > 0 && lastName.compareTo("Vimes") < 0)) {
            userTeam = teamNames[4];
        }
        if ((lastName.compareTo("Potter")) > 0) {
            userTeam = teamNames[4];
        }
        System.out.println("You are on team " + userTeam);
    }
}
