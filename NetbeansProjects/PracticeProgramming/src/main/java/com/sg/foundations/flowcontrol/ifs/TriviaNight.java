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
public class TriviaNight {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int q1;
        boolean q1Status = false;
        int q2;
        boolean q2Status = false;
        int q3;
        boolean q3Status = false;
        int userScore = 0;

        System.out.println("It's TRIVIA NIGHT! Are you ready?!\n"
                + "\n"
                + "FIRST QUESTION!\n"
                + "What is the Lowest Level Programming Language?\n"
                + "1) Source Code		2) Assembly Language\n"
                + "3) C#				4) Machine Code");
        q1 = userInput.nextInt();
        System.out.println("YOUR ANSWER: " + q1 + "\n");

        if (q1 == 2) {
            userScore++;
            q1Status = true;
        }

        System.out.println("SECOND QUESTION!\n"
                + "Website Security CAPTCHA Forms Are Descended From the Work of?\n"
                + "1) Grace Hopper		2) Alan Turing\n"
                + "3) Charles Babbage		4) Larry Page");
        q2 = userInput.nextInt();
        System.out.println("YOUR ANSWER: " + q2 + "\n");

        if (q2 == 2) {
            userScore++;
            q2Status = true;
        }

        System.out.println("LAST QUESTION!\n"
                + "Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?\n"
                + "1) Serenity			2) The Battlestar Galactica\n"
                + "3) The USS Enterprise	4) The Millennium Falcon");
        q3 = userInput.nextInt();
        System.out.println("YOUR ANSWER: " + q3 + "\n");

        if (q3 == 4) {
            userScore++;
            q3Status = true;
        }

        System.out.println("Here are the results!");
        System.out.println("Question 1 was: " + q1Status);
        System.out.println("Question 2 was: " + q2Status);
        System.out.println("Question 3 was: " + q3Status);
        switch (userScore) {

            case 0: {
                System.out.println("Not even close, You got " + userScore + " questions right");
                break;
            }
            case 1: {
                System.out.println("Sorry, you only got " + userScore + " question correct");
                break;
            }
            case 2: {
                System.out.println("Nice!, you got " + userScore + " questions correct");
                break;
            }
            case 3: {
                System.out.println("Fantastic!, You got all 3 correct!");
                break;
            }
            default: {
                System.out.println("You only enter the numbers shown");
                break;
            }
        }

    }
}
