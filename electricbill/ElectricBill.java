

package com.mycompany.electricbill;

import java.util.Scanner;


public class ElectricBill {

    public static void main(String[] args) {
       Scanner InElec = new Scanner(System.in);
       
       System.out.print("Enter Electricity : ");
       double elec = InElec.nextDouble();
       
       if (elec > 300) {
           System.out.println("Electricity bill : "+elec+" unit");
           System.out.println("Tota : l"+ elec*5+" bath");
       } else if (elec > 100) {
           System.out.println("Electricity bill : "+elec+" unit");
           System.out.println("Total : "+ elec*4.25+" bath");
       }  else {
           System.out.println("Electricity bill : "+elec+" unit");
           System.out.println("Total : "+ elec*3.5+" bath");
       }
    }
}
