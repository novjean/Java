/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printfloydstriangle;

import java.util.Scanner;
/**
 *
 * @author Novjean
 */
public class PrintFloydsTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,c,d, num = 1;
        
        System.out.println("Enter number of rows: ");
        Scanner in  = new Scanner(System.in);
        n = in.nextInt();
        
        System.out.println("Floyd's Triangle: ");
        for(c = 1; c<=n; c++)
        {
            for(d=1; d<=c; d++)
            {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        
    }
    
}
