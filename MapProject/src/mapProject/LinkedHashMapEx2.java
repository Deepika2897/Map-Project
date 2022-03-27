package mapProject;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhmob=new LinkedHashMap<Integer,String>();        
		lhmob.put(101,"Deepi");    
		lhmob.put(102,"Vijay");    
		lhmob.put(103,"Bismi");    
	     System.out.println("Before invoking remove() method: "+lhmob);     
	     lhmob.remove(102);  
	    System.out.println("After invoking remove() method: "+lhmob);    
	      
	
	System.out.println("****************************");
	//ITERATION OF A MAP
	for(Map.Entry<Integer,String> m:lhmob.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	}
	}

