
package multiplicationtable;

import java.util.Scanner;


public class MultiplicationTable {

    public static void main(String[] args) {
        
       Scanner num = new Scanner(System.in);
       System.out.print("enter your  number : ");
       
       int number = num.nextInt();
       
       for(int i = 1; i <= 12;i++){
           System.out.println(number+"x"+i+" = " + (number*i));
       }
       num.close();
    }
}
