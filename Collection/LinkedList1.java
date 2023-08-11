import java.util.*;
class Linked{
	public static void main(String[] args){
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30); 

		ll.add(2,100);

		ll.addFirst(50);
		ll.addLast(2);

		System.out.println(ll.getLast());

		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		System.out.println(ll);
	}
}
