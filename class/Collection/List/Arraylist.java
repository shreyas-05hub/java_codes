import java.util.*;

class ArraylistDemo extends ArrayList{
	public static void main(String[] args){
		ArraylistDemo al = new ArraylistDemo();
		al.add(10);
		al.add(20.5f);
		al.add("shreyas");
		al.add(10);
		al.add(20.5f);
		System.out.println(al);

		//add(int,element);
		al.add(3,"c2w");
		System.out.println(al);

		//size();		
		System.out.println(al.size());

		//contains(object);
		System.out.println(al.contains("shreyas"));
		System.out.println(al.contains(30));

		//indexOf
		System.out.println(al.indexOf(20.5f));

		//LastIndexOf
		System.out.println(al.lastIndexOf(20.5f));

		//get(int)
		System.out.println(al.get(3));

		//set(int,E)
		System.out.println(al.set(3,"Incubator"));
		System.out.println(al);

		//boolean addAll(collection)
		ArrayList al2 = new ArrayList();
		al2.add("salman");
		al2.add("sarukh");
		al.add(al2);
		System.out.println(al);

		//addAll(int,collection)
		al.addAll(3,al2);
		System.out.println(al);

		//remove(int);
		al.remove(4);
		System.out.println(al);

		//toArray()
		Object arr[] = al.toArray();
		System.out.println(arr);

		//removeRange(int,int);
		al.removeRange(3,7);
		System.out.println(al);
		
		//clear()
		al.clear();
		System.out.println(al);		
		//clear()
		al.clear();
		System.out.println(al);
	}
}
