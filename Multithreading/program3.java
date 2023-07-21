//Runnable
class Mythread implements Runnable{
	public void run(){
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadDemo{
	public static void main(String[] args){
		Mythread obj=new Mythread();
			Thread t=new Thread(obj);
			t.start();
			System.out.println(Thread.currentThread().getName());
			//obj.start(); runnable kde start method nahiye so thread cha object create krun t.start kel
			
	}
}
