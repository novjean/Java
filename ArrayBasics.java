package arraysearchdemo;

import java.util.Scanner;
/**
 *
 * @author Novjean
 */
public class ArraySearchDemo {

    static int[] arr = new int[30];
    static int arraySize = 10;
    
    public static void FillArray(){                   //Fill the array with random values
        for(int i=0; i<arraySize; i++){
            arr[i] = (int) (Math.random()*20);
        }
    }
    
    public static void DisplayArray(){                //Display the array
        System.out.println();
        for(int i = 0; i<arraySize; i++){
            System.out.print("["+i+"]" + " : " + arr[i] + " \t");
            if((i+1)%5==0)
                System.out.println();
        }
        System.out.println();
            
    }
    
    public static boolean SearchNum(int num){           //Search whether a value eists within the array
        for(int i =0; i<arraySize; i++){
            if(arr[i]==num)
                return true;
        }
        return false;
    }
    
    public static void DeleteIndex(int index){          //Delete a specified index within the array
        if(index<arraySize){
            for(int i =index; i<arraySize; i++){
                arr[i] = arr[i+1];
            }
            arraySize--;
        }
        else System.out.println("Index out of bounds.");
   
    }
    
    public static void InsertArray(int num){          //Insert a value at the end of the array
        if(arraySize<=arr.length){
            arr[arraySize] = num;
            arraySize++;
        }
        else{
            System.out.println("The array is at full capacity.");
        }
    }
    
    public static String LinearSearch(int num){         //Performa linear search and return al the indexes where the number is present
        String numLocation = "";
        boolean flag = false;
        for(int i = 0; i<arraySize; i++){
            if(arr[i] == num){
                flag = true;
                numLocation += i+" , ";
            }
        }
        if(flag == false){
            numLocation = "None.";
        }
        return numLocation;
    }
    
    public static void main(String[] args) {
        FillArray();                
        DisplayArray();
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to be searched: ");
        System.out.println(SearchNum(in.nextInt()));
        
        System.out.println("Enter the index to be deleted: ");
        DeleteIndex(in.nextInt());
        DisplayArray();
        
        System.out.println("Enter the number to be inserted: ");
        InsertArray(in.nextInt());
        DisplayArray();
        
        System.out.println("Enter number to be searched: ");
        String numLocations = LinearSearch(in.nextInt());
        System.out.println("Found in indexes " + numLocations);
    }
    
} 
