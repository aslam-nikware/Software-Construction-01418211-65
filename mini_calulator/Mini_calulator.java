
package mini_calulator;

import java.util.Scanner;


public class Mini_calulator {

 
    public static void main(String[] args) {
        Scanner Innumber1 = new Scanner(System.in);
        Scanner Innumber2 = new Scanner(System.in);
        Scanner InOP = new Scanner(System.in);
        
        System.out.print("Enter Number 1 : ");
        double number1 = Innumber1.nextDouble();
        
        System.out.print("Enter Operator : ");
        char op = InOP.next().charAt(0);
        
        System.out.print("Enter Number 2 : ");
        double number2 = Innumber2.nextDouble();
        
        
        switch(op) {
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
             case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;
            case '%':
                System.out.println(number1 % number2);
                break;
        }
    }
    
}
