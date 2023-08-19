import java.util.*;

class CursorDemo{
	public static void main(String[] args){
		Vector al = new Vector();
		al.add("Ashish");
		al.add("Kanha");
		al.add("Rahul");
		System.out.println(al.getClass().getName());

		//for each loop
		for(var x : al){	
			System.out.println(x.getClass().getName());
		}

		//iterator
		Iterator cursor = al.iterator();
	
		System.out.println(cursor.getClass().getName());

		while(cursor.hasNext()){
			if("Kanha".equals(cursor.next()))
					cursor.remove();
		}
		System.out.println(al);

		//ListIterator
		ListIterator ltr = al.listIterator();

		System.out.println(ltr.getClass().getName());
		
		while(ltr.hasNext()){
			System.out.println(ltr.next());
		}

		while(ltr.hasPrevious()){
			System.out.println(ltr.previous());
		}

		//Enumeration
		Enumeration en = al.elements();

		System.out.println(en.getClass().getName());
		
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
	}
}
