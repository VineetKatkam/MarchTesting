package Interview;

import java.util.HashMap;

public class Interview {

	public static void main(String[] args) {
	
		String Name ="Vineth Katkam";
		String Rev="";
		String arry [] = {"a","e","i","o","u"};
		//char c[]=Name.toCharArray();
		
//		for(int i=Name.length()-1 ;i>=0 ;i--)
//		{
//			Rev= Rev+Name.charAt(i);
//		}
//		System.out.println("Reverse a string: "+Rev);
		
//		for(int i=0 ;i<arry.length ;i++)
//		{
//			for(int j=0+1;j< )
//		}
		

		String Word="aaabbcddddee";
		char new1 [] =Word.toCharArray();
		
		HashMap<Character,Integer> map =new HashMap<Character,Integer>();
		
		for(char c: new1)
		{
			if(map.containsKey(c)) 
			{
				map.put(c, map.get(c)+1);
			}else
			{
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		
		
	}

}
