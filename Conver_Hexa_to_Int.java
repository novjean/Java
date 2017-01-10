/*
Tax calculation
 */
package taxesapplication;

import java.util.Scanner;

/**
 *
 * @author Novjean
 */
public class TaxesApplication {
    double sales_tax = 8.25;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\\n");
 
        
        System.out.println("Enter the hexa value: ");
        String hexa = in.nextLine();
        int digit = ConvertHexToDigits(hexa);
        System.out.println("Hexa: " + hexa + ", Digit: " + digit);
        
    }
    
    public static int ConvertHexToDigits(String hexa){
        int value = 0;
        
        for(int i=0; i<hexa.length(); i++){
            value = value*16 + hexValue(hexa.charAt(i));
        }
        return value;
    }
    
    public static int hexValue(char c){
        switch(c){
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            case 'A': return 10;
            case 'a': return 10;
            case 'B': return 11;
            case 'b': return 11;
            case 'C': return 12;
            case 'c': return 12;
            case 'D': return 13;
            case 'd': return 13;
            case 'E': return 14;
            case 'e': return 14;
            case 'F': return 15;
            case 'f': return 15;
            default : System.out.println("ERROR: Invalid hexa character: " +c);
            
        }
        return 0;
    }
}
