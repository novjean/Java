import java.util.Hashtable;
import java.util.Map;


public class HashTable_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Customer1> map = new Hashtable<Integer,Customer1>();
		Customer1 c1 = new Customer1(101, "jin", "ontario, Canada");
		Customer1 c2 = new Customer1(201, "polkn", "ohe, China");
		Customer1 c3 = new Customer1(315, "dann", "thiio, palaa");
		Customer1 c4 = new Customer1(15, "neo", "matrix, palaa");
		
		map.put(3, c3);
		map.put(1, c1);
		map.put(3, c4);
		map.put(2, c2);
		
		DisplayMap(map);
		
		map.remove(2);
		DisplayMap(map);
		
		System.out.println("Size of map: " + map.size());
		
		if (map.containsKey(1)){
			System.out.println("hashtable contains the key 1");
		}
		
		if(map.containsValue(c4))
			System.out.println("Yes, map contains c4 object");
		
	}
	
	public static void DisplayMap(Map<Integer,Customer1> map){
		System.out.println();
		for(Map.Entry<Integer,Customer1> entry : map.entrySet()){
			int key = entry.getKey();
			Customer1 c = entry.getValue();
			System.out.print(key + " Details: ");
			System.out.println( c.id + " " + c.name + " " + c.address);
		}
	}
}
