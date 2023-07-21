class Mythread extends Thread{
	public void run(){
		Thread t=Thread.currentThread();
		System.out.println(t.getPriority()); // Default priority=5
		//System.out.println(t.getName()); // Default priority=5
		//t.setPriority(11); // error limit is 10

	}
}
class ThreadDemo{
	public static void main(String[] args){
		Thread t1=Thread.currentThread();
		t1.setPriority(3);
		System.out.println(t1.getPriority());

		Mythread obj=new Mythread();
		obj.start();
		
		
		
		Mythread obj1=new Mythread();
		obj1.start();
		

		// obj1.start() error already in running state illegal start thread exception
	}
}
