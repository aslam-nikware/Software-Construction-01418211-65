
package workshop2;

import java.util.Scanner;


public class Workshop2 {

    
    public static void main(String[] args) {
        Scanner inputS= new Scanner(System.in);
        System.out.print("Your Name : ");
        String name = inputS.nextLine();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Your Age : ");
        int age = input.nextInt();
        
       Scanner inputW= new Scanner(System.in);
        System.out.print("Your Weight : ");
       double weight = inputW.nextDouble();
       
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Your Name is : "+name);
        System.out.println("Your Age is : "+age);
        System.out.println("Your Weight is : "+weight);
        
        
    }
    
}
