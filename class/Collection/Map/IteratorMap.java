import java.util.*;

class IM{
	public static void main(String[] args){
		SortedMap tm = new TreeMap();

		tm.put("Ind","India");
		tm.put("Pak","Pakistan");
		tm.put("Sl","SriLanka");
		tm.put("Aus","Australia");
		System.out.println(tm);

		Set<Map.Entry> data = tm.entrySet();
		Iterator<Map.Entry> itr = data.iterator();

		while(itr.hasNext()){
			Map.Entry abc = itr.next();
			System.out.println(abc.getKey() +":"+abc.getValue());
		}
	}
}
