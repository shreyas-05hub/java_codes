import java.util.*;

class SSDemo{
	public static void main(String[] args){
		SortedSet ss = new TreeSet();
		ss.add("Kanha");
		ss.add("Ashish");
		ss.add("Rahul");
		ss.add("Rajesh");
		ss.add("Badhe");
		System.out.println(ss);
		System.out.println(ss.headSet("Kanha"));
		System.out.println(ss.tailSet("Kanha"));
		System.out.println(ss.subSet("Ashish","Rahul"));
		System.out.println(ss.first());
		System.out.println(ss.last());
		System.out.println(ss);
	}
}
