/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsissubstring;

import java.util.Scanner;

/**
 *
 * @author Novjean
 */
public class StringsIsSubstring {

    /**
     * @param args the command line arguments
     */
    
    public static boolean isRotation(String s1, String s2)
    {
        int len = s1.length();
        
        if(len == s2.length() && len>0)
        {
            String s1s1 = s1+s1;
            if(s1s1.contains(s2))
                return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st String: ");
        String str1 = in.nextLine();
        System.out.println("Enter 2st String: ");
        String str2 = in.nextLine();
        
        boolean res = isRotation(str1,str2);
        System.out.println(res);
    }
    
}
