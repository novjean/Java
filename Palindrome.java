/*
Determmine if a number is palindrome
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author Novjean
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int num = in.nextInt();
        int number = num;
        int rev = 0;
        
        while(num!=0){
            rev = rev*10;
            rev = rev + num%10;
            num /= 10;
        }
        System.out.println(rev);
        
        if(number == rev){
            System.out.println(number + " is a palindrome.");
        }
        else
            System.out.println(number + " is not a palindrome");
                
    }
    
}
