
package workshop3;

import java.util.Scanner;


public class Workshop3 {

    public static void main(String[] args) {
       Scanner inputW = new Scanner(System.in);
       System.out.print("Width : ");
       double width = inputW.nextDouble();
       
       Scanner inputH = new Scanner(System.in);
       System.out.print("Height : ");
       double height = inputH.nextDouble();
       
       double area = width*height;
       
       System.out.println("-------------------------------------------------------------");
       System.out.println("Area : "+area);
    }
    
}
