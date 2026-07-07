
package workshop6;

import java.util.Scanner;


public class Workshop6 {


    public static void main(String[] args) {
       Scanner inputName = new Scanner(System.in);
       System.out.print("Name : ");
       String name = inputName.nextLine();
       
       Scanner inputAge = new Scanner(System.in);
       System.out.print("Age : ");
       int age = inputAge.nextInt();
       
       Scanner inputH = new Scanner(System.in);
       System.out.print("height : ");
       double height = inputH.nextDouble();
       
       Scanner inputW = new Scanner(System.in);
       System.out.print("weight : ");
       double weight = inputW.nextDouble();
       
       double bmi = weight/(height*height);
       
       System.out.println("------------------------------------------------------------");
       
       System.out.println("Name : "+name);
       System.out.println("age : "+age);
       System.out.println("bmi : "+bmi);
    }
    
}
