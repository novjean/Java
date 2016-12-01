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

        String[] elementsToAdd2 = { "100", "510", "170", "214", "268", "398",
				"235", "802", "900", "723", "699", "1", "16", "999", "890",
				"725", "998", "978", "988", "990", "989", "984", "320", "321",
				"400", "415", "450", "50", "660", "624" };
        
        theFunc.hashFunction2(elementsToAdd2, theFunc.theArray);
        
        theFunc.displayTheHashtable();
        
    }
    
    public void hashFunction2(String[] stringsForArray, String[] theArray){
        
        for(int n = 0; n<stringsForArray.length; n++)
        {
            String newElementVal = stringsForArray[n];
            
            int arrayIndex = Integer.parseInt(newElementVal) % 29;          //because array has only 30 slots
            
            System.out.println("Modulus Index = " + arrayIndex + " for value " + newElementVal);
            
            while(theArray[arrayIndex] != "-1")         //to check if there is a value already in that index
            {
                ++arrayIndex;      
                
                System.out.println("Collision. Try " + arrayIndex + " instead.");
                
                arrayIndex = arrayIndex % arraySize;            //to cycle back to the 0 index
            }
            
            theArray[arrayIndex] = newElementVal;
        }
        
    }
    
    HashTableDemo(int size)   //receive size for the array
    {
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1");    //filling the array and to determing which parts are empty
    }
    
    
    public void displayTheHashtable() {

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
