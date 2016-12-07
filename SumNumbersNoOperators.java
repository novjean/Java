package sumnumbersnooperators;

import java.util.Scanner;

/**
 *Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * @author Novjean
 */
public class SumNumbersNoOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = in.nextInt();
        System.out.println("Enter the second number: ");
        int b = in.nextInt();

        int sum = getSum(a,b);
        System.out.println("Sum = " + sum);
    }
	
    public static int getSum(int a, int b)	{
        int c;

        while(b!=0){ 
            c= a&b;
            a = a^b;
            b = c<<1;
        }
        return a;
    }

}
