/*
create a middleware in order to save data from a table within the database
perform CRUD operations on the data structure
 */
package javacollections;

import java.util.*;
/**
 *
 * @author Novjean
 */
public class JavaCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        ArrayList<String> list = new ArrayList<String>();  //created the ArrayList
        list.add("Jim");
        list.add("jon");
        
        //traversing the list using iterator
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        for(String obj : list){
            System.out.println(obj);
        }
*/
        Customer c1 = new Customer(101,"nova j","kottayam, IN");
        Customer c2 = new Customer(102,"john d","jacksonville, FL");
        Customer c3 = new Customer(103,"jimmy j","lafayette, IN");
        
        ArrayList<Customer> al = new ArrayList<Customer>();
        al.add(c1);
        al.add(c2);
        al.add(c3);
        DisplayList(al);
        
        
        Customer c4 = new Customer(104,"jake d","bloom, pL");
        Customer c5 = new Customer(105,"polo j","liko, PA");
        ArrayList<Customer> al2 = new ArrayList<Customer>();
        al2.add(c4);
        al2.add(c5);
        al2.add(c2);
        
        al.addAll(al2);
        //DisplayList(al);
        
        //al.removeAll(al2);
        //DisplayList(al);
        
        al.retainAll(al2);
        DisplayList(al);
          
    } 
    public static void DisplayList(ArrayList<Customer> al){
        System.out.println();
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            Customer ct = (Customer)itr.next();
            System.out.println(ct.id + " " + ct.name + " " + ct.address);
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
