package mapProject;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tob=new TreeMap<Integer,String>();
		tob.put(1, "DEEPI");
		tob.put(2, "KAVI");
		tob.put(3, "BISMI");
		tob.put(5,"SHAFIN");
		tob.put(4, "VIJAY");
		tob.put(6, "ANUSHA");
		tob.put(7, "MUKESH");
		
		System.out.println(tob);
		
		System.out.println("****************************");
		for(Map.Entry<Integer,String> m:tob.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	

	}

}
