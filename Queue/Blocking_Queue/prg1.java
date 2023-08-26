import java.util.concurrent.*;
import java.util.*;
class BlockDemo{
	public static void main(String[] args)throws InterruptedException{
		BlockingQueue bq=new ArrayBlockingQueue(3);  // linkedBlocking / priorityblocking 
		bq.offer(10);
		bq.offer(20);
		bq.offer(30);
		System.out.println(bq);

		bq.offer(40);  //  it return 10 20 30 40 not added

		System.out.println(bq);
		//bq.put(40);  // (waiting state)Throws interrupted exception bcz of it is method of blocking queue
		System.out.println(bq);


		bq.offer(40,5,TimeUnit.SECONDS);
		System.out.println(bq);

		bq.take();  // takes first value 10 and return 20 30
		System.out.println(bq);

		ArrayList al=new ArrayList();
		System.out.println("ArrayList"+ al);
		bq.drainTo(al); // copying data into arraylist

		System.out.println("Arraylist"+ al);

		System.out.println(bq);  // after copying bq will be empty
	}
}
