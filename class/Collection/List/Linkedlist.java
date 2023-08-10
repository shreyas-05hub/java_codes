import java.util.LinkedList;
class LinkedListDemo{
	public static void main(String[] args){
		LinkedList ll = new LinkedList();

		ll.add(20);
		ll.addFirst(10);
		ll.addLast(30);
		System.out.println(ll);

		System.out.println(ll.getFirst());

		System.out.println(ll.getLast());

		ll.add(2,25);	
		System.out.println(ll);

		ll.removeFirst();

		ll.removeLast();
		System.out.println(ll);
	}
}
