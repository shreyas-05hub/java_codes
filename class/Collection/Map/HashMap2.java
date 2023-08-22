import java.util.*;

class HMDemo2{
	public static void main(String[] args){
		HashMap hm = new HashMap();

		hm.put("Java",".java");
		hm.put("Dart",".dart");
		hm.put("Python",".py");
		hm.put("C",".c");

		System.out.println(hm);

		//get();
		System.out.println(hm.get("Python"));

		//keyset();
		System.out.println(hm.keySet());

		//values
		System.out.println(hm.values());

		//entrySet
		System.out.println(hm.entrySet());
	}
}
