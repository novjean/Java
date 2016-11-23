/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreplacewhitespace;

import java.util.Scanner;

/**
 *
 * @author Novjean
 */
public class StringReplaceWhiteSpace {

    /**
     * @param args the command line arguments
     */
    
    public static String replaceWhiteSpace(char[] c)
    {
    
        int spaceCount = 0;
        int len = c.length;
        System.out.println(len);
        
        for(int i=0; i<len; i++)
        {
            if(c[i] == ' ')
            {
                spaceCount++;
            }
        }
        int newLength = len + spaceCount*2;
        c[newLength] = '\0';
        for(int i = len-1;i>=0;i--)
        {
            System.out.println(c[i]);
            if(c[i] == ' ')
            {
                c[newLength - 1] = '0';
                c[newLength - 2] = '2';
                c[newLength - 3] = '%';
                newLength = newLength - 3;
            }
            else
            {
                c[newLength - 1] = c[i];
                newLength = newLength-1;
            }
        }
        String res = new String(c);
        return res;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = in.nextLine();
        
        String newStr = replaceWhiteSpace(str.toCharArray());
        System.out.println(newStr);
    }
    
}
