import java.util.concurrent.*;
class Mythread implements Runnable{
	int num;
	Mythread(int num){
		this.num=num;
	}
	public void run(){
		System.out.println(Thread.currentThread()+" Start "+num);
		DailyTask();
	}
	void DailyTask(){
		try{
			Thread.sleep(3000);
		}catch(InterruptedException ie){}
	}
}
class ThreadDemo{
	public static void main(String[] args){
		ExecutorService ser=Executors.newFixedThreadPool(6);
		for(int i=1;i<=6;i++){
			Mythread obj=new Mythread(i);
			ser.execute(obj);
		}
		ser.shutdown();
	}
}
