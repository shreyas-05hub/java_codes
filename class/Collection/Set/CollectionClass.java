import java.util.*;

class SortDemo{
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add("Kanha");
		al.add("Ashish");
		al.add("Badhe");
		al.add("Shashi");
		al.add("Rahul");
		System.out.println(al);

		TreeSet ts = new TreeSet(al);	
		System.out.println(ts);

		Collections.sort(al);
		
		System.out.println(al);
	}
}
