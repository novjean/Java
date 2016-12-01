/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printamicableperfectnumbersinrange;

import java.util.Scanner;
/**
 *
 * @author Novjean
 */
public class PrintAmicablePerfectNumbersInRange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();
        
        //Find the factors and sum them. 
        int sumFactorsNum1 = sumFactors(num1);
        System.out.println("sumFactorsNum1: " + sumFactorsNum1);
        int sumFactorsNum2 = sumFactors(num2);
        System.out.println("sumFactorsNum2: " + sumFactorsNum2);
        
        if((sumFactorsNum1 == num2) &&(sumFactorsNum2 == num1))
            System.out.println(num1 + " & " + num2 + " are amicable.");
        else
            System.out.println("They are not amicable.");
        
    }
    
    public static int sumFactors(int num)
    {
        int sum = 0;
        int divisor = num-1;
        
        while(divisor>0)
        {
            System.out.println(num%divisor);
            if((float)(num%divisor) == 0.0)
            {
                System.out.println(divisor + " is a factor of " + num);
                sum += divisor;
            }
            divisor--;
        }
        
        return sum;
    }
}
