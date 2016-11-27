
/*
elemets sorted in asc of desc orger by comparing adjacent elemnts
and place them on asc or desc order
if we have n elements, we require n-1 passes
*/

package bubblesort;

import java.util.Scanner;

/**
 *
 * @author Novjean
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {9,8,5,7,6};
        System.out.println("Before sorting: ");
        
        for(int i: arr)
        {
            System.out.println(i);
        }
        
        bubbleSort(arr);
        
        System.out.println("After sorting: ");
        
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
    
    public static void bubbleSort(int[] arr)
    {
        int temp=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=1;j<(arr.length) - i; j++)
            {
                if(arr[j-1]>arr[j])
                {
                    temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
