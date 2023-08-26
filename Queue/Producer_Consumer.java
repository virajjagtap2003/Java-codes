import java.util.concurrent.*;
import java.util.*;
class Producer implements Runnable{
	BlockingQueue bq=null;
	Producer(BlockingQueue bq){
		this.bq=bq;
	}
	public void run(){
		for(int i=1;i<=10;i++){
			try{
				bq.put(i);  // put throws ex.
				System.out.println("Producer "+i);
			}catch(InterruptedException ie){
				
			}
		}
	}
}
class Consumer implements Runnable{
	BlockingQueue bq=null;
	Consumer(BlockingQueue bq){
		this.bq=bq;
	}
	public void run(){
		for(int i=1;i<=10;i++){
			try{
				bq.take();
				System.out.println("Consumer "+i);
			}catch(InterruptedException ie){
			
			}
			try{
				Thread.sleep(3000);
			}catch(InterruptedException ie){
			
			}
		}
	}
}
class ProducerConsumer{
	public static void main(String [] args){
		BlockingQueue bq=new ArrayBlockingQueue(3);
		Producer produce=new Producer(bq);
		Consumer consume=new Consumer(bq);

		Thread ProducerThread=new Thread(produce);
		Thread ConsumerThread=new Thread(consume);

		ProducerThread.start();
		ConsumerThread.start();

	}
}
