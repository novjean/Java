/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amicablepairshashtable;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Novjean
 */
public class AmicablePairsHashTable {

    String[] theArray;
    int arraySize;
    
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();
       
        int size = (num2 - num1)+1;       //Size for the hashtable
        
        AmicablePairsHashTable theFunc = new AmicablePairsHashTable(size);
        
        theFunc.FillHashTable(num1, num2, theFunc.theArray);      //Fill the hashtable with values in some order
     
        //theFunc.displayTheHashtable();      //Use only if less than 30 values, created by Derek Banas
        
        theFunc.findAmicables(num1, num2, theFunc.theArray);      
        
    }
    
    public void findAmicables(int num1, int num2, String[] theArray)
    {
           for(int i = 0; i< arraySize; i++)
        {
            int arrayValue = Integer.parseInt(theArray[i]);     //determine the value within the index of the array
            //System.out.println(arrayValue);
            
            if(arrayValue >= num1 && arrayValue<=num2)          //condition: the number should be within the range
            {  
                int numAtIndex = num1+i; //220                  //method used to fill the hashtable
                //System.out.println(numAtIndex);
                
                if(numAtIndex!=arrayValue)
                {
                    int indexToCheck = arrayValue - num1;      //e.g. 284 - 200 = 84 
                    //System.out.println(indexToCheck);
                
                    int valIndexToCheck = Integer.parseInt(theArray[indexToCheck]);
                    //System.out.println(valIndexToCheck);

                    if(numAtIndex == valIndexToCheck)
                    {
                        System.out.println(numAtIndex + " and " + arrayValue +" are amicable.");
                        
                        theArray[indexToCheck] = ""+(num1-1);           //destroying the value in the hash table to avoid duplicate display
                    }
                }
            }
            //System.out.println();
        }
    }
    
    public void FillHashTable(int num1, int num2, String[] theArray)
    {
        int sum = 0;
        
        for(int i=num1; i<=num2; i++)
        {
            sum = sumFactors(i);
            
            //int arrayIndex = i % (arraySize - 1);
            
            int arrayIndex = i - num1;
            
           // System.out.println("Modulus Index = " + arrayIndex + " for value " + i);
            
            while(theArray[arrayIndex] != "-1")
            {
                ++arrayIndex;
                
             //   System.out.println("Collision. Try " + arrayIndex + " instead.");
                
                arrayIndex = arrayIndex % arraySize;    
            }
            
        theArray[arrayIndex] = ""+sum;
        
        }
    }
    
        public static int sumFactors(int num)
    {
        int sum = 0;
        int divisor = num-1;
        
        while(divisor>0)
        {
            //System.out.println(num%divisor);
            if((float)(num%divisor) == 0.0)
            {
                //System.out.println(divisor + " is a factor of " + num);
                sum += divisor;
            }
            divisor--;
        }
        return sum;
    }
    
    AmicablePairsHashTable(int size)
    {
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1");
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
