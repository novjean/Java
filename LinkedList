/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdemo;

import java.util.*;

/**
 *
 * @author Novjean
 */
public class LinkedListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList ll = new LinkedList();
        
        ll.add("F");
        ll.add("A");
        ll.add("B");
        ll.add("Y");
        ll.add("G");
        ll.add("R");
        ll.addLast("Z");
        ll.addFirst("A");
        
        System.out.println("Original contents of ll: " + ll);
        
        //remove elements from the linked list
        ll.remove("F");
        ll.remove(2);
        System.out.println("Contents of ll after deletion: " + ll);
        
        //remove first and last elements
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Contents of ll after deletion: "+ ll);
        
        //get and set a value
        Object val = ll.get(2);
        ll.set(2, (String)val + " Changed");
        System.out.println("ll aftr change: " + ll);
        
    }
    
}
