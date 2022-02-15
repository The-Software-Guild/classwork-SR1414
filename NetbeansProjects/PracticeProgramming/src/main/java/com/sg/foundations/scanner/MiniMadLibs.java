/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author srior
 */
public class MiniMadLibs {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        String noun1, noun2;
        String adjective1, adjective2; 
        String pluralnoun1 ,pluralnoun2, pluralnoun3;
        String verbPresentTense; 
        String sameVerbPastTense;
        int number;
        System.out.println("Let's Play Mad Libs");
        System.out.println("Enter a Noun: ");
        noun1 = userInput.nextLine();
        
        System.out.println("Now an adjective: ");
        adjective1 = userInput.nextLine();
        
        System.out.println("Another Noun: ");
        noun2 = userInput.nextLine();
        
        System.out.println("Give any number: ");
        number = Integer.parseInt(userInput.nextLine());
        
        System.out.println("Another Adjective: ");
        adjective2 = userInput.nextLine();
        
        System.out.println("now enter a Plural Nouns: ");
        pluralnoun1 = userInput.nextLine();
        System.out.println("Another one: ");
        pluralnoun2 = userInput.nextLine();
        System.out.println("One more: ");
        pluralnoun3 = userInput.nextLine();
        
        System.out.println("Almost done, now a verb in present tense: ");
        verbPresentTense = userInput.nextLine();
        System.out.println("Last one, enter the same verb BUT in past tense: ");
        sameVerbPastTense = userInput.nextLine();
        
        System.out.println(noun1 + ": the " + adjective1 + " frontier.");
        System.out.println("These are the voyages of the starship " + noun2 + ".");
        System.out.println("Its " + number + " year mission: to explore strange " + adjective1 + " " + pluralnoun1 + ",");
        System.out.println("to seek out " + adjective2 + " " + pluralnoun2 + " and " + adjective1 + " " + pluralnoun3 + "," );
        System.out.println("to boldy " + verbPresentTense + " where no one has " + sameVerbPastTense + " before.");
        
        
    }
}
