/*
Reverse a string using string functions
 */
package reversestring;

import java.util.Scanner;

/**
 *
 * @author Novjean
 */
public class ReverseString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\\n");
  
        System.out.println("Enter a string: ");
        String s = in.nextLine();
        int length = s.length();
        System.out.println(length);
        String reverse = ReverseString(s, length-1);
        
        System.out.println("Reversed string: " + reverse);
        
    }
    
    public static String ReverseString(String s, int index){
        if(index == 0){
            return s.charAt(0) + "";
        }
        
        char letter = s.charAt(index);
        return letter + ReverseString(s, index-1);
    }
    
}
