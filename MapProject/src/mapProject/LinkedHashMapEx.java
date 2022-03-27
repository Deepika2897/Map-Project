package mapProject;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
public static void main(String[] args) {
	LinkedHashMap<Integer, String> lhmob=new LinkedHashMap<Integer,String>();
	lhmob.put(1, "DEEPI");
	lhmob.put(2, "KAVI");
	lhmob.put(3, "BISMI");
	lhmob.put(5,"SHAFIN");
	lhmob.put(4, "VIJAY");
	System.out.println(lhmob);
	
	System.out.println("****************************");
	for(Map.Entry<Integer,String> m:lhmob.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
}



}

