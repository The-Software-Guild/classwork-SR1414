/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author srior
 */
public class ForByFor {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.print("|");

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i == 0) {
                        if (j == 0) {
                            if (k == 0) {
                                System.out.print("#");
                            }
                            if (k == 1) {
                                System.out.print("#");
                            }
                            if (k == 2) {
                                System.out.print("#");
                            }
                        }
                        if (j == 1) {
                            if (k == 0) {
                                System.out.print("$");
                            }
                            if (k == 1) {
                                System.out.print("$");
                            }
                            if (k == 2) {
                                System.out.print("$");
                            }
                        }
                        if (j == 2) {
                            if (k == 0) {
                                System.out.print("#");
                            }
                            if (k == 1) {
                                System.out.print("#");
                            }
                            if (k == 2) {
                                System.out.print("#");
                            }
                        }
                    }
                    if (i == 1) {
                        if (j == 0) {
                            if (k == 0) {
                                System.out.print("$");
                            }
                            if (k == 1) {
                                System.out.print("$");
                            }
                            if (k == 2) {
                                System.out.print("$");
                            }
                        }
                        if (j == 1) {
                            if (k == 0) {
                                System.out.print("#");
                            }
                            if (k == 1) {
                                System.out.print("#");
                            }
                            if (k == 2) {
                                System.out.print("#");
                            }
                        }
                        if (j == 2) {
                            if (k == 0) {
                                System.out.print("$");
                            }
                            if (k == 1) {
                                System.out.print("$");
                            }
                            if (k == 2) {
                                System.out.print("$");
                            }
                        }
                    }
                    if (i == 2) {
                        if (j == 0) {
                            if (k == 0) {
                                System.out.print("#");
                            }
                            if (k == 1) {
                                System.out.print("#");
                            }
                            if (k == 2) {
                                System.out.print("#");
                            }
                        }
                        if (j == 1) {
                            if (k == 0) {
                                System.out.print("$");
                            }
                            if (k == 1) {
                                System.out.print("$");
                            }
                            if (k == 2) {
                                System.out.print("$");
                            }
                        }
                        if (j == 2) {
                            if (k == 0) {
                                System.out.print("#");
                            }
                            if (k == 1) {
                                System.out.print("#");
                            }
                            if (k == 2) {
                                System.out.print("#");
                            }
                        }
                    }
                }
                System.out.print("|");
            }
            System.out.println("");
        }
    }

}

//i IS EACH ROW starting with |
//j is each block of XXX| 
//k is each individual character of XXX|
