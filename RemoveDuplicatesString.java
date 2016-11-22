/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeduplicatesstring2;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Novjean
 */
public class RemoveDuplicatesString2 {

    /**
     * @param args the command line arguments
     */
    
    //ALTERNATE METHOD: Using second array
    /*
    public static String removeDuplicates(String input)
    {
        String result = "";
        
        for(int i = 0; i<input.length(); i++)
        {
            if(!result.contains(String.valueOf(input.charAt(i))))
            {
                result += String.valueOf((input.charAt(i)));
            }
        }
        return result;
    }
    */
    
    public static String removeDuplicates(String str)
    {
        Set<Character> charSet = new LinkedHashSet<>();
        char[] chars = str.toCharArray();
        
        for(char c: chars)
        {
            charSet.add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        for(Character character : charSet)
        {
            sb.append(character);
        }
        
        return (sb.toString());

    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = in.nextLine();
        
        String newStr = removeDuplicates(str);
        System.out.println(newStr);
        
    }
    
}
