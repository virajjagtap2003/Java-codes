class Demo extends Thread{
	public void run(){
		System.out.println("Demo:"+Thread.currentThread().getName());
	}
}
class Mythread extends Thread{
	public void run(){
		Demo obj1=new Demo();
		obj1.start();	
		System.out.println("Mythread:"+Thread.currentThread().getName());
	}
}
class ThreadDemo{
	public static void main(String[] args){
		
		System.out.println("ThreadDemo:"+Thread.currentThread().getName());
		Mythread obj=new Mythread();
		obj.start();
	}
}
