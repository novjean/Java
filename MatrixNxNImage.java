/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixrotatenxnimage;

import java.util.Scanner;


/**
 *
 * @author Novjean
 */
public class MatrixRotateNxNImage {

    /**
     * @param args the command line arguments
     */
    
    public static void displayMatrix(int[][] matrix)
    {
        for(int i = 0;i<matrix.length; i++)
        {
            for(int j = 0;j<matrix[0].length; j++)
                System.out.print(" " + matrix[i][j]);
            System.out.println();
        }
    }
    
    public static void rotate(int[][] matrix, int n)
    {
        for(int layer = 0;layer<n/2; layer++)
        {
            int first = layer;
            int last = n-1-layer;
            
            for(int i = first; i<last;i++)
            {
                int offset = i- first;
                int top = matrix[first][i];
                
                matrix[first][i] = matrix[last-offset][first];
                
                matrix[last-offset][first] = matrix[last][last-offset];
                
                matrix[last][last-offset] = matrix[i][last];
                
                matrix[i][last] = top;
   
            }
        } 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Dimenstion: ");
        int n = in.nextInt();
        int[][] matrix = new int [n][n];

        for(int i = 0;i<n; i++)
        {
            for(int j = 0;j<n; j++)
                matrix[i][j] = (int)(Math.random() * 100);
        }
        
        displayMatrix(matrix);
        rotate(matrix, n);
        
        System.out.println();
        displayMatrix(matrix);
    }
}
