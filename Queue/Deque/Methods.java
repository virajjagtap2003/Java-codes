// Dequq methods
import java.util.*;
class DequeDemo {
	public static void main(String[] args){
		Deque dq=new ArrayDeque();
		dq.offer(10);
		dq.offer(40);
		dq.offer(20);
		dq.offer(30);

		System.out.println(dq);

		dq.offerFirst(100);
		System.out.println(dq);

		dq.offerLast(500);
		System.out.println(dq);

		dq.pollFirst();
		System.out.println(dq);

		dq.pollLast();
		System.out.println(dq);
		
		System.out.println(dq.peekFirst()); // 10
		System.out.println(dq.peekLast());  // 30

		// Iterator on Deque

		Iterator itr=dq.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+"  ");
		}

		System.out.println();

		// Descending Iterator
		Iterator itr1=dq.descendingIterator();
		while(itr1.hasNext()){
			System.out.print(itr1.next()+"  ");
		}
	
	}
}
