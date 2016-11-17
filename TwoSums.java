/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twosums;

/**
 *
 * @author Novjean
 */
public class TwoSums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums[] = {2,7,11,15};
        int target = 18;
        int ctr = 0;
        
        for(int i =0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[j] == target - nums[i])
                {
                    System.out.println(nums[i] + "\t" + nums[j]);
                    ctr++;
                }
            }
        }
        if(ctr==0)
        {
            System.out.println("There are no two Sums !!!"); 
        }
       
       
    }
    
}
