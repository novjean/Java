/*
 Determine fibonacci through recursion
 */
package fibonaccirecursion;

import java.util.Scanner;

/**
 *
 * @author Novjean
 */
public class FibonacciRecursion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the desired length of the series: ");
        int num = in.nextInt();
        
        FibonacciSeries(num);
    }
    
    public static void FibonacciSeries(int num){
        System.out.println("The Fibonacci series is ");
        for(int i = 1; i<=num; i++){
            System.out.printf("%s ", getFibonacci(i));
        }
    }
    
    public static int getFibonacci(int n){
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        return getFibonacci(n-1) + getFibonacci(n-2);
    }
}
