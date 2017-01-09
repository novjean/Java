/*
Print prime numbers between any number between 1-100 using if
 */
package printprimenumbers;

import java.util.Scanner;

public class PrintPrimeNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 1-100: ");
        int inputNum = in.nextInt();
        
        System.out.printf("Prime Numbers are : 1, 2, 3 ");
        for(int i=4; i<inputNum; i++){
            if(IsPrime(i)){
                System.out.printf(", " + i);
            }
                
        }
  
    }
    
    public static boolean IsPrime(int num){
        if(num%2 == 0)
            return false;
        for(int i=3; i*i<=num; i=i+2){
            if(num%i == 0)
                return false;
        }
        return true;
    }
    
}
