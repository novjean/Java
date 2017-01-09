/*
Get option from user and perform calculator operations
 */
package pkg1_3_calculator;

import java.util.Scanner;

public class Main {

  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = in.nextInt();
        
        System.out.println("Calculato Options: ");
        System.out.println("1.Add \n2.Subtract \n3.Multiply \n4.Divide");
        System.out.println("Enter you choice: ");
        int input = in.nextInt();
        
        
        switch(input){
            case 1: System.out.println("Add Result: "+ (num1+num2));
                    break;
            case 2: System.out.println("Subtract Result: "+ (num1-num2));
                    break;
            case 3: System.out.println("Multiply Result: "+ (num1*num2));
                    break;
            case 4: System.out.println("Divide Result: "+ (num1/num2));
                    break;
            default: System.out.println("Invalid choice.");
                    break;

        }
        
    }
    
}
