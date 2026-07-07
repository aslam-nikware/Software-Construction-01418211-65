
package workshop4;

import java.util.Scanner;


public class Workshop4 {


    public static void main(String[] args) {
       Scanner inputM = new Scanner(System.in);
       System.out.print("Midterm Score : ");
       double midtermScore = inputM.nextDouble();
       
       Scanner inputF = new Scanner(System.in);
       System.out.print("Fianl Score : ");
       double finalScore = inputF.nextDouble();
       
       double mean = (midtermScore+finalScore)/2;
       
       System.out.println("---------------------------------------------------------------");
       System.out.println("Mean Score : "+mean);
    }
    
}
