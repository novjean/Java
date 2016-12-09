/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    static HashMap<Integer, Integer> map = new HashMap<>();
    static int size = 0;
    
    public static void main(String[] args) {
        
        String[] elementsToAdd2 = { "100", "510", "170", "214", "268", "398",
				"235", "802", "900", "723", "699", "1", "16", "999", "890",
				"725", "998", "978", "988", "990", "989", "984", "320", "321",
				"400", "415", "450", "50", "660", "624" };
        
        InsertIntoHashTable(elementsToAdd2);
        
        map.remove(20);                         //Remove from hashtable according to key
        
        for(Map.Entry kv: map.entrySet())       //DIsplay all key,value pairs
            System.out.println(kv);
        
        if (map.containsValue(900))             //Search for a specific value
            System.out.println("900 is found.");
        
        for(int key : map.keySet())             //Display the entire key set
            System.out.println(key);
        
        for(int val: map.values())              //Display all values
            System.out.println(val);
            
            
    }
    
    public static void InsertIntoHashTable(String[] elements){
        
        size = elements.length;
        for(int i=0;i<size; i++){
            int elementVal = Integer.parseInt(elements[i]);
             int hashIndex = Integer.parseInt(elements[i]) % size;
         
            while(map.containsKey(hashIndex)){
                 hashIndex++;
                 System.out.println("Collision. Try " + hashIndex);
                 hashIndex %= size;
            }
            map.put(hashIndex, elementVal );   
        }
    } 
}
