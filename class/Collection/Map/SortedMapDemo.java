import java.util.*;

class SM{
	public static void main(String[] args){
		SortedMap tm = new TreeMap();

		tm.put("Ind","India");
		tm.put("Pak","Pakistan");
		tm.put("Ban","Bangladesh");
		tm.put("Aus","Australia");
		tm.put("Sl","Srilanka");

		System.out.println(tm);

		//subMap
		System.out.println(tm.subMap("Aus","Pak"));

		//headMap
		System.out.println(tm.headMap("Pak"));

		//tailMap		
		System.out.println(tm.tailMap("Pak"));

		//lastKey
		System.out.println(tm.lastKey());

		//firstKey
		System.out.println(tm.firstKey());

		//keySet
		System.out.println(tm.keySet());

		//values
		System.out.println(tm.values());

		//entrySet
		System.out.println(tm.entrySet());
	}
}
