/*
catch error if any character other than number is entered. using NumberFormatException
 */
package errormessagedemo;

import java.util.Scanner;

/**
 *
 * @author Novjean
 */
public class ErrorMessageDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 0, num2 = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter 1st number: ");
        try{
            num1 = Integer.parseInt(in.nextLine());
        }
        catch(NumberFormatException e){
            System.out.println("ERROR: " +e.getMessage());
        }
        
        System.out.println("Enter 2nd number: ");
        try{
            num2 = Integer.parseInt(in.nextLine());
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("The numbers are " + num1 + " and " + num2);
    }
    
}
