import java.util.*;


public class TreeSet_Class {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Customer> set = new TreeSet<Customer>();
		Customer c1 = new Customer(1, "jin", "ontario, Canada");
		Customer c2 = new Customer(2, "polkn", "ohe, China");
		Customer c3 = new Customer(3, "dann", "thiio, palaa");
		
		set.add(c1);
		set.add(c2);
		set.add(c3);
		
		Set<Customer> set2 = new TreeSet<Customer>();
		Customer c4 = new Customer(4, "deny", "topo, pa");
		Customer c5 = new Customer(5, "daffy", "to, ta");
		
		set2.add(c4);
		set2.add(c5);
		
		DisplaySet(set);
		DisplaySet(set2);
		
		set.addAll(set2);
		DisplaySet(set);
		
		set.clear();
		System.out.println("Check if set is empty: " + set.isEmpty());
		
//		Set<Customer> cloneset = new TreeSet<Customer>();
//		//cloneset = (Set<Customer>)set2.clone();
//		DisplaySet(cloneset);
	
	}
	public static void DisplaySet(Set<Customer> set){
		System.out.println();
		for(Customer c : set){
			System.out.println(c.id + " " + c.name + " , " + c.address);
		}
	}
}

class Customer implements Comparable<Customer>{
	int id;
	String name;
	String address;
	
	Customer(int id, String name, String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public int compareTo(Customer c){
		if(id>c.id){
			return 1;
		}else if(id<c.id){
			return -1;
		}else{
			return 0;
		}
	}
}
