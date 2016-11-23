/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsanagram;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Novjean
 */
public class StringsAnagram {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static boolean anagram(String s1, String s2)
    {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        s1 = new String(chars1);
        s2 = new String(chars2);
        
        if(s1.equals(s2))
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st String: ");
        String str1 = in.nextLine();
        System.out.println("Enter 2st String: ");
        String str2 = in.nextLine();
        
        boolean res = anagram(str1,str2);
        System.out.println(res);
    }
    
}
