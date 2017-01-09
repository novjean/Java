/*
Calculator with ue of class and switch
 */
package class_calculator;

import java.util.Scanner;

public class Class_Calculator {


    public static void main(String[] args) {
        // TODO code application logic here
        Calculator c = new Calculator();
        Scanner in = new Scanner(System.in);
        int num1=0, num2=0;
        
        System.out.println("Calculator Options: ");
        System.out.println("1.Add \n2.Subtract \n3.Multiply \n4.Divide");
        System.out.println("5.Square Root (float) \n6.Suare Root (Int) \n7.Factorial");
        System.out.println("Enter you choice: ");
        int input = in.nextInt();
        
        if(input>0 && input<5)
        {
            System.out.println("Enter 1st number: ");
            num1 = in.nextInt();
            System.out.println("Enter 2nd number: ");
            num2 = in.nextInt();
        }
        
        switch(input){
            case 1: System.out.println("Add Result: "+ c.Add(num1,num2));
                    break;
            case 2: System.out.println("Subtract Result: "+ c.Subtract(num1,num2));
                    break;
            case 3: System.out.println("Multiply Result: "+ c.Multiply(num1,num2));
                    break;
            case 4: System.out.println("Divide Result: "+ c.Divide(num1,num2));
                    break;
            case 5: System.out.println("Enter float number for square root: ");
                    float number = in.nextFloat();
                    System.out.println("Square root: "+ c.SquareRoot(number));
                    break;
            case 6: System.out.println("Enter integer for square root: ");
                    int number1 = in.nextInt();
                    System.out.println("Square root: "+ c.SquareRoot(number1));
                    break;
            case 7: System.out.println("Enter integer for factorial: ");
                    int number2 = in.nextInt();
                    System.out.println("Factorial result: "+ c.Factorial(number2));
                    break;
            default: System.out.println("Invalid choice.");
                    break;

        }
    }
    
}

class Calculator{
    public int Add(int a, int b){
        return a+b;
    }
    public int Subtract(int a, int b){
        return a-b;
    }
    public int Multiply(int a, int b){
        return a*b;
    }
    public float Divide(int a, int b){
        try{
            return (float)a/b;
        }
        catch(ArithmeticException e){
            System.out.println("ERROR: Divisor is zero.");
        }
        return 0;
    }
    public double SquareRoot(float number){
        return (float)Math.sqrt(number);
    }
    public double SquareRoot(int number){
        return (float)Math.sqrt(number);
    }
    public int Factorial(int number){
        int fact = 1;
        for(int i = 2;i<=number; i++){
            fact = fact*i;
        }
        return fact;
    }
    
}
