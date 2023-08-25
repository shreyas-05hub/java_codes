import java.util.*;

class NS{
	public static void main(String[] args){
		NavigableSet ns = new TreeSet();
		ns.add(10);
		ns.add(30);
		ns.add(14);
		ns.add(27);
		ns.add(23);
		System.out.println(ns);

		//lower
		System.out.println(ns.lower(23));
		System.out.println(ns.lower(25));
		System.out.println(ns.lower(3));

		//floor();
		System.out.println(ns.floor(23));
		System.out.println(ns.floor(25));

		//ceiling();		
		System.out.println(ns.ceiling(23));
		System.out.println(ns.ceiling(25));

		//higher();
		System.out.println(ns.higher(27));

		//pollFirst(); pollLast();
		ns.pollFirst();
		ns.pollLast();
		System.out.println(ns);
		
		//descendingSet();
		System.out.println(ns.descendingSet());

		//descendingIterator
		Iterator itr1 = ns.descendingIterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}

		//subSet();
		System.out.println(ns.subSet(10,true,27,false));
	}
}
