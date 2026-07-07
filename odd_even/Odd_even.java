/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odd_even;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Odd_even {

    public static void main(String[] args) {
        Scanner scNum = new Scanner(System.in);
        
        System.out.print("Enter Your number : ");
        int number  = scNum.nextInt();
        
        if (number > 0 ) {
            System.out.println(number + " is Positive");
        } else if (number < 0 ) {
            System.out.println(number + " is Negative");
        } else {
            System.out.println(number + " is Zero");
        }
    }
}
