import java.util.*;
class DequeDemo{
	public static void main(String[] args){
		Deque obj=new ArrayDeque();
		obj.offer(10);	
		obj.offer(20);	
		obj.offer(30);	
		obj.offer(40);	

		System.out.println(obj);
		obj.offerFirst(100);

		System.out.println(obj);

		obj.offerLast(1000);
		System.out.println(obj);

		obj.pollFirst();
		System.out.println(obj);

		obj.pollLast();
		System.out.println(obj);

		System.out.println(obj.peekFirst());

		System.out.println(obj.peekLast());
		
		// Iterator on Deque
		Iterator itr=obj.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("Descending");
		Iterator itr2=obj.descendingIterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}

	}
}
