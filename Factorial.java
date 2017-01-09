/*
Generate factorial of a number
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author Novjean
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int factorial = Factorial(num);
        System.out.println("The factorial of " + num + ": "+ factorial);
    }
    
    public static int Factorial(int num){
        int fact = 1;
        for(int i = 2;i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }
}
