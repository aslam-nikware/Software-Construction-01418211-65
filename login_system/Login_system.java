
package login_system;

import java.util.Scanner;


public class Login_system {


    public static void main(String[] args) {
       Scanner scUsername = new Scanner(System.in);
       Scanner scPassword = new Scanner(System.in);
       
       String username = "Lamm";
       String passwords = "lammmyZa";
       
       System.out.print("Enter your username : ");
       String Inusername = scUsername.nextLine();
       
       System.out.print("Enter your passwords : ");
       String Inpassword = scPassword.nextLine();
       
       if (Inusername.equals(username) && Inpassword.equals(passwords)) {
           System.out.println("Welcome  " + username );
       } else {
           System.out.println("Access Denied");
       }
    }
    
}
