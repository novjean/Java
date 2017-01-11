import java.util.HashMap;
import java.util.Map;


public class HashMap_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Customer1> map = new HashMap<Integer,Customer1>();
		Customer1 c1 = new Customer1(101, "jin", "ontario, Canada");
		Customer1 c2 = new Customer1(201, "polkn", "ohe, China");
		Customer1 c3 = new Customer1(315, "dann", "thiio, palaa");
		Customer1 c4 = new Customer1(499, "dingo", "thiio, palaa");
		
		map.put(1,c1);
		map.put(2,c2);
		map.put(3,c3);
		
		DisplayMap(map);
//		map.clear();
//		DisplayMap(map);
		
		System.out.println("Check if key 2 is present: " + map.containsKey(2));
		System.out.println("Size of map: "+ map.size());
		System.out.println(map);
		map.remove(2);
		DisplayMap(map);

	}
	public static void DisplayMap(Map<Integer,Customer1> map){
		for(Map.Entry<Integer, Customer1> entry : map.entrySet()){   //entrySet returns a collection view of the mappings
			int key = entry.getKey();
			Customer1 c = entry.getValue();
			System.out.println(key + " Details: ");
			System.out.println(c.id +" " + c.name + " " + c.address);
		}
	}

}
class Customer1{
	int id;
	String name, address;
	
	Customer1(int id, String name, String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
}
