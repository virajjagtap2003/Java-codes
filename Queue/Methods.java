import java.util.*;
class QueueDemo{
	public static void main(String[] args){
		Queue que=new LinkedList();
		que.offer(10);
		que.offer(20);
		que.offer(50);
		que.offer(40);
		que.offer(30);
		que.offer(60);

		System.out.println(que);
		que.poll(); 
		System.out.println(que);
		que.remove();      // when you apply remove on null queue it shows nosuch element exception. poll not shows 
		System.out.println(que);

		System.out.println(que.peek());
		
		System.out.println(que.element());// when you apply element on null queue it shows nosuch element exception. peek not shows

	}
}
