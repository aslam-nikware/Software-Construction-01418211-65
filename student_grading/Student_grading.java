/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student_grading;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student_grading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scMid = new Scanner(System.in);
       Scanner scFinal = new Scanner(System.in);
       
       System.out.print("Enter your Midterm score : ");
       
       double midSc = scMid.nextDouble();
       
       System.out.print("Enter your Final score : ");
       
       double finalSc = scFinal.nextDouble();
       
       double score  = midSc + finalSc;
       
       if (score >= 80) {
           System.out.println("Your grade is : A");
       } else if (score >= 75) {
           System.out.println("Your grade is : B+ ");
       } else if (score >= 70) {
           System.out.println("Your grade is : B ");
       } else if (score >= 65) {
           System.out.println("Your grade is : C+ ");
       } else if (score >= 60) {
           System.out.println("Your grade is : C ");
       } else if (score >= 55) {
           System.out.println("Your grade is : D+ ");
       } else if (score >= 50) {
           System.out.println("Your grade is : D ");
       } else {
           System.out.println("Your grade is : F ");
       }
    }
    
}
