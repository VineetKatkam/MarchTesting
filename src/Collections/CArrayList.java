package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class CArrayList {

	public static void main(String[] args) {
	
		LinkedList<String> arry =new LinkedList<String>();
		arry.add("Vineet");
		arry.add("Katkam");
		arry.add("Katkam");
		arry.add("Katkam");
		arry.add("Katkam");
		arry.add("Katkam");
		arry.add("Katkam");
		arry.add("1");
		arry.add(null);
		arry.add(null);
		arry.add(null);
		arry.set(1, "vishal");

	
		
//		System.out.println(arry);
//		System.out.println(arry.get(0));
//		System.out.println(arry.get(2));
//		System.out.println(arry.get(3));
//		System.out.println(arry.get(6));

		Iterator<String> it=arry.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
