
package eventcount;

import java.util.Scanner;

public class EventCount {


    public static void main(String[] args) {
        Scanner start = new Scanner(System.in);
        Scanner end = new Scanner(System.in);
        
        System.out.print("enter your start number : ");
        int startNum = start.nextInt();
        System.out.print("enter your end number : ");
        int endNum = end.nextInt();
        
        int count = 0;
        int result = 0;
        
        for(int i = startNum; i <= endNum;i++){
            if(i%2==0){
                System.out.println(i);
                result += i;
                count++;
            }
        }

        
        System.out.println("All even count number : " + count);
        System.out.println("sum of even number  : " + result);

        start.close()
        end.close()
        
    }
}
