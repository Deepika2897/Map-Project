package mapProject;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Long, String> tob=new TreeMap<Long,String>();
		tob.put(9873736473l, "DEEPI");
		tob.put(3878378374l, "KAVI");
		tob.put(5676476773l, "BISMI");
		tob.put(9837637666l,"SHAFIN");
		tob.put(9865452355l, "VIJAY");
		tob.put(8973727767l, "ANUSHA");
		tob.put(7374736473l, "MUKESH");
		tob.put(8378376376l,"SINDHUJA");
		tob.put(8273823827l, "PRAGATHI");
		tob.put(2837283782l, "SUJI");
		
		System.out.println(tob);
		
		System.out.println("****************************");
		for(Map.Entry<Long,String> m:tob.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	

	}

	}


