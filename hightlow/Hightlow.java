
package hightlow;
import java.util.Scanner;
import java.util.Random;

public class Hightlow {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ranN  = new Random();
        
        System.out.print("Enter Lowest Random number : ");
        int lowestNum = sc.nextInt();
        System.out.print("Enter Hightest Random number : ");
        int highestNum = sc.nextInt();
  
        int randomInt  = (ranN.nextInt(highestNum - lowestNum + 1)+ lowestNum);
        int count  = 0;

       System.out.println(randomInt);
       System.out.println("guss in between : " + lowestNum + " - " + highestNum );
        while(true){
            System.out.print("enter number :");
            int guss = sc.nextInt();
            if(guss == randomInt) {
                System.out.println("correct !!!");
                System.out.println("Your use " + count + " round");
                break;
            }else {
                System.out.println("incorrect try agin");
                if(guss > randomInt) {
                    System.out.println("it too hight");
                } else{ 
                     System.out.println("it too low");
                }
            }
            count++;
        }
    }
    
}
