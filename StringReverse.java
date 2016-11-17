/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreverse;
import java.util.Scanner;
/**
 *
 * @author Novjean
 */
public class StringReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s = "";
        String rev = "";
        
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        
        rev = reverseString(s);
        
        System.out.println(rev);
    }
    
    public static String reverseString(String s)
    {
        char[] in = s.toCharArray();
        int begin = 0;
        int end = in.length - 1;
        char temp;
        while(end>begin)
        {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }
}
