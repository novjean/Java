/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printnumbers;

/**
 *
 * @author Novjean
 */
public class PrintNumbers {

    /**
     * @param args the command line arguments
     */
    public static void printNumbers(int n)
    {
        if(n<10)
        {
             System.out.println(n);
             printNumbers(n+1);
        }

    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n=0;
        printNumbers(n);
        
    }
    
}
