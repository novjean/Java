import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class Vector_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Customer1> v = new Vector<Customer1>();
		v.add(new Customer1(101, "john", "tampa, fl"));
		v.add(new Customer1(342, "tttre", "fvcsva, fl"));
		v.add(new Customer1(167, "hedvewn", "tehea, yl"));
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			Customer1 c = (Customer1)e.nextElement();
			System.out.println(c.id + " " + c.name + " " + c.address);
		}
		
	}

}
