package matrixcountnegativenumbers;

import java.util.Scanner;

/**
 *
 * @author Novjean
 */
public class MatrixCountNegativeNumbers {

    /**
     * Find the number of negative numbers in a column-wise / row-wise sorted matrix M[][]. 
     * Suppose M has n rows and m columns.
     */
    public static void main(String[] args) {
        
        int m =3 ;
        int n =4;
        int[][] mat = new int[m][n];
        
        //Initalizing with some values
        mat[0][0] = -3;        mat[0][1] = -2;        mat[0][2] = -1;        mat[0][3] = 1;
        mat[1][0] = -2;        mat[1][1] = 2;        mat[1][2] = 3;        mat[1][3] = 4;
        mat[2][0] = 4;        mat[2][1] = 5;        mat[2][2] = 7;        mat[2][3] = 8;
   
        
        displayArray(mat);
        
        int count = countNegative(mat, m ,n);
        
        System.out.println("Negative numbers count = " + count);
    }
    
    public static int countNegative(int[][] mat, int m, int n)
    {
        int count = 0;
        //int j = n-1;
        
        for(int i = 0; i<m; i++)
        {
           for(int j = n-1; j>=0; j--)          //cycle from last column n back
            {
                if(mat[i][j] < 0)               //check if the value is below zero
                {
                    count += j+1;               //add the olumn value to count, as every value left woulf be negative 
                                                //in a row wise and column sortd array
                    i++;                        //         
                }
            }
        }
        
        
        return count;
    }
    
    public static void displayArray(int[][] mat)
    {
        int m = mat.length;
        int n = mat[0].length;
        
        System.out.println("The array is : ");
        for(int i=0; i<m; i++)
        {
            for(int j=0;j<n; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
