/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixsetzeros;

import java.util.Scanner;

/**
 *
 * @author Novjean
 */
public class MatrixSetZeros {

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
    
    public static void setZeros(int[][] matrix)
    {
        int[] row = new int[matrix.length];
        int[] column = new int[matrix[0].length];
        
        for(int i = 0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j] == 0)
                {
                    row[i] = 1;
                    column[j]=1;
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++)
        {
            for (int j=0; j<matrix[0].length; j++)
            {
                if(row[i]==1 || column[j]==1)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x Dimenstion: ");
        int m = in.nextInt();
        System.out.println("Enter y Dimenstion: ");
        int n = in.nextInt();
        int[][] matrix = new int [m][n];

        for(int i = 0;i<m; i++)
        {
            for(int j = 0;j<n; j++)
                matrix[i][j] = (int)(Math.random() * 100);
        }
        
        //matrix[2][4] = 0;
  
        displayMatrix(matrix);
        setZeros(matrix);
        
        System.out.println();
        System.out.println("Updated Matrix: ");
        displayMatrix(matrix);
        
    }
    
}
