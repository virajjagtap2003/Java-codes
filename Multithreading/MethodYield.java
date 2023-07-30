class Mythread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());

	}
}
class ThreadDemo{
	public static void main(String[] args){
		Mythread obj=new Mythread();
		obj.start();

		obj.yield();

		System.out.println(Thread.currentThread().getName());
	}
}
