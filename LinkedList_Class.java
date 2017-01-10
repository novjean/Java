/*
Implement linked list with class Customer 
 */
package linkedlist_class;

import java.util.*;
/**
 *
 * @author Novjean
 */
public class LinkedList_Class {

    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Customer> l1 = new LinkedList<Customer>();
        
        Customer c1 = new Customer(1,"nova k", "kottayam, KL");
        Customer c2 = new Customer(2,"kichuppi m", "thodupuzha, KL");
        Customer c3 = new Customer(3,"jane dow k", "bellevu, WA");
        Customer c4 = new Customer(4,"kim jon","north korea");
        Customer c5 = new Customer(5,"hun jun", "chennai, TN");
        
        l1.add(c1);
        l1.add(c2);
        l1.add(c3); 
        DisplayList(l1);
        
        l1.addFirst(c4);                //adds to the beginning of the linked list
        DisplayList(l1);
        
        l1.addLast(c5);                 //
        DisplayList(l1);
        
        System.out.println("Size of the list is: " + l1.size());
        System.out.println("Check if list contains c3: " + l1.contains(c3));
        
        
        l1.remove(c3);
        System.out.println("Check if list contains c3: " + l1.contains(c3));
        
        Customer c = l1.getFirst();
        
        c = l1.getLast();
        System.out.println(c.id + " " + c.name + " " + c.address);
        
        DisplayList(l1);
        System.out.println("Index of c5: " + l1.indexOf(c5));
       
                
        
    }
    
    public static void DisplayList(LinkedList<Customer> ll){
        System.out.println();
        for(Customer c : ll){
            System.out.println(c.id + " - " + c.name + " - " + c.address);
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
