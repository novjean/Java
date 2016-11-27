/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missingnumberinarray;

import java.util.Arrays;
/**
 *
 * @author Novjean
 */
public class MissingNumberInArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {1,2,3,6,4};
        Arrays.sort(arr);
        int len = arr.length;
        
        int total = (arr[len-1] * (arr[len-1] + 1))/2;
        
        int actualSum = 0;
        for(int i:arr)
            actualSum += i;
        
        System.out.println("Missing number in array is : " + (total-actualSum)); 
    }
    
}
