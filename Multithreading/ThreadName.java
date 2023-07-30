// Declaring Threadname at the time of create (its a right way compare to set name)

class Mythread extends Thread{
	Mythread(String str){  // constructor (parameter string)
		super(str);
	}
	public void run(){
		System.out.println(getName()); // Thread-0 to xyz changed
		System.out.println(Thread.currentThread().getThreadGroup());
	}
}
class ThreadDemo{
	public static void main(String [] args){
		Mythread obj=new Mythread("XYZ");
		obj.start();
	}
}
