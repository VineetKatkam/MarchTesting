package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CSet {

	public static void main(String[] args) {
		TreeSet<String> arry =new TreeSet<String>();
		arry.add("Vineet");
		arry.add("Katkam");
		//arry.add("Katkam");
		
		
		System.out.println(arry);
		
		Iterator<String> it=arry.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
