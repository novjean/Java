/*
 * Implement  an  algorithm  to  determine  if  a string  has  
   all  unique  characters. What  if you can not use additional 
   data structures?
 */
package stringuniquecharacters;

import java.util.Scanner;

/**
 *
 * @author Novjean
 */
public class StringUniqueCharacters {

    /**
     * @param args the command line arguments
     */
    
    public static boolean isUniqueChars(String str)
    {
        boolean[] char_set = new boolean[256];
        
        for(int i=0; i<str.length(); i++)
        {
            int val = str.charAt(i);
            if(char_set[val]) 
                return false;
            char_set[val] = true;
        }
        return true;
    }
    
    /*public static boolean isUniqueChars(String str)
    {
        int checker=0;
        for(int i=0;i<str.length();i++)
        {
            int val = str.charAt(i) - 'a';
            if((checker&(1<<val))>0)
                return false;
            checker |=(1<<val);
        }
        return true;
    }
*/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = in.nextLine();
                    
        boolean res = isUniqueChars(str);
        System.out.println(res);
        
    }
    
}
