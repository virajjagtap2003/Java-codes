import java.util.*;
class PqDemo{
	public static void main(String[] args){
		PriorityQueue pq=new PriorityQueue();
		pq.offer(20);
		pq.offer(10);
		pq.offer(40);
		pq.offer(30);

		System.out.println(pq);

		PriorityQueue pq1=new PriorityQueue();
                pq1.offer("Ashish");
                pq1.offer("Badhe");
                pq1.offer("Kanha");
                pq1.offer("Rahul");

                System.out.println(pq1);
	}
}
