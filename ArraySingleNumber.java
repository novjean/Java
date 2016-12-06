/*
Given an array of integers, every element appears twice except for one. Find that single one.
 */
package arraysinglenumber;

/**
 *
 * @author Novjean
 */
public class ArraySingleNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {1,4,4,2,3,1,2};
        
        System.out.println("The array is: ");
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(" " + arr[i]);
        }
        
        int singleNumber = FindSingleNumber(arr);
        System.out.println("Missing number pair is: " + singleNumber);
    }
    
    public static int FindSingleNumber(int[] arr){
    
        int diff = 0;
        System.out.println();
        for(int num : arr)
        {
            diff ^= num;
            //System.out.println("num, diff = " +num +" "+ diff);
        }
        
        diff = diff & (-diff);
        //System.out.println("diff: "+diff);
       
        int rets = 0;
        for(int num:arr)
        {
            if((num & diff)!=0)
                rets ^= num;
        }
    return rets;
    }
}
        
