/*
 * To change this license header, choose License Headers in Project Properties.
 Implement a hashSet class
 * and open the template in the editor.
 */
package hashset_class;

import java.util.*;
/**
 *
 * @author Novjean
 */
public class HashSet_Class {

    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<Customer> hs = new HashSet<Customer>();
        Customer c1 = new Customer(1, "jin kazama", "oregi, China");
        Customer c2 = new Customer(2,"kichuppi m", "thodupuzha, KL");
        Customer c3 = new Customer(3,"jane dow k", "bellevu, WA");
        Customer c4 = new Customer(4,"kim jon","north korea");
        Customer c5 = new Customer(5,"hun jun", "chennai, TN");
        
        hs.add(c1);
        hs.add(c2);
        hs.add(c3);
        
        /*
        Iterator itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        */
        DisplaySet(hs);
        
        //hs.clear();
        //DisplaySet(hs);
        
        System.out.println("Check if set empty: " + hs.isEmpty());
        System.out.println("Check if set contains c2: " + hs.contains(c2));
        
        hs.remove(c2);
        System.out.println("Check if set contains c2: " + hs.contains(c2));
        
        HashSet<Customer> cloneset = new HashSet<Customer>();
        cloneset = (HashSet)hs.clone();
        DisplaySet(cloneset);
        
        System.out.println("Size of set: " +hs.size());
        
    }
    
    public static void DisplaySet(HashSet<Customer> set){
        System.out.println();
        for(Customer c : set){
            System.out.println(c.id + " " + c.name + " " + c.address);
        }
            
    }
    
}

class Customer{
    int id;
    String name;
    String address;
    
    Customer(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
