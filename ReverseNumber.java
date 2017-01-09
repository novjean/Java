/*
 Reverse a number using while anf do-while
 */
package reverseanumber;

import java.util.Scanner;


public class ReverseANumber {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        int reverse=0;
        
        while(num!=0){
            reverse = reverse * 10;
            reverse = reverse + num%10;
            num = num/10;
        }
        System.out.println("Reversed number is: " + reverse);
    }
    
}
