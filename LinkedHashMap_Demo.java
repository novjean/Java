import java.util.*;

public class LinkedHashMapDemo {
	public static void main(String args[]){
		LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer, String>();
		
		hm.put(1,"romeo");
		hm.put(2,"juliet");
		
		for(Map.Entry m: hm.entrySet()){
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
	
}
