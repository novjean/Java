 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtabledemo;

import java.util.Arrays;

/**
 *
 * @author Novjean
 */
public class HashTableDemo {

    String[] theArray;
    int arraySize;
    int itemsInArray = 0;
    

    public static void main(String[] args) {
        // TODO code application logic here
        HashTableDemo theFunc = new HashTableDemo(30);
        
        String[] elementsToAdd = {"1", "6", "17", "21", "27"};  //values has to be between 0 - 29
        
        theFunc.hashFunction1(elementsToAdd, theFunc.theArray);
        
        theFunc.displayTheStack();
        
    }
    
    public void hashFunction1(String[] stringsForArray, String[] theArray){
        
        for(int n = 0; n<stringsForArray.length; n++){
            
            String newElementVal = stringsForArray[n];          //taking ech value inside the array
            
            theArray[Integer.parseInt(newElementVal)] = newElementVal;
        }
    }
    
    HashTableDemo(int size)   //receive size for the array
    {
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1");    //filling the array and to determing which parts are empty
    }
    
    
    public void displayTheStack() {

        int increment = 0;

        for (int m = 0; m < 3; m++) {

                increment += 10;

                for (int n = 0; n < 71; n++)
                        System.out.print("-");

                System.out.println();

                for (int n = increment - 10; n < increment; n++) {

                        System.out.format("| %3s " + " ", n);

                }

                System.out.println("|");

                for (int n = 0; n < 71; n++)
                        System.out.print("-");

                System.out.println();

                for (int n = increment - 10; n < increment; n++) {

                    if (theArray[n].equals("-1"))
                            System.out.print("|      ");
                    else
                            System.out.print(String.format("| %3s " + " ", theArray[n]));
                }

                System.out.println("|");

                for (int n = 0; n < 71; n++)
                        System.out.print("-");

                System.out.println();

        }
    }
}
