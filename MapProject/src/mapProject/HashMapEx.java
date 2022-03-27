package mapProject;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> hob=new HashMap<Integer,String>();
		hob.put(1, "DEEPI");
		hob.put(2, "KAVI");
		hob.put(3, "BISMI");
		hob.put(5,"SHAFIN");
		hob.put(4, "VIJAY");
		System.out.println(hob);
		
		System.out.println("****************************");
		for(Map.Entry<Integer,String> m:hob.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
