/*
print a person details with scanner delimiter
 */
package pkg1.printpersondetails;

import java.util.Scanner;

public class PrintPersonDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        in.useDelimiter("\\n");             //delimiting the scanner
        
        System.out.println("Enter First Name: ");
        String firstName = in.nextLine();
        System.out.println("Last Name: ");
        String lastName = in.nextLine();
        System.out.println("Address: ");
        String address = in.nextLine();
        System.out.println("Phone Number: ");
        long phoneNumber = in.nextLong();
        System.out.println("Age: ");
        int age = in.nextInt();
        
        System.out.println("First Name: "+ firstName);
        System.out.println("Last Name: "+ lastName);
        System.out.println("Phone Number: "+ phoneNumber);
        System.out.println("Address: "+ address);
        System.out.println("Age: "+ age);   
    }
    
}
