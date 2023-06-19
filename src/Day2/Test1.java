package Day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;


public class Test1 {

	public static void main(String[] args) 
	{
		TreeSet<Object> alt = new TreeSet<Object>(); 
		alt.add("Riyansh");
		alt.add("Dattatri");
		alt.add("Katkam");
		alt.add("Shashikala");
		alt.add("Amruta");
		alt.add("Vishal");
		alt.add(null);
		
		System.out.println(alt);
	}
}