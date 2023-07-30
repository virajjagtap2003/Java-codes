class Mythread extends Thread {

	void fun(){
	/*	try{
			Thread.sleep(5000);
		}catch(InterruptedException obj3){
		}*/
		System.out.println("hello");
	}
	public void run()/*throws InterruptedException*/{ /*only try catch is used in run method*/
		try{
			Thread.sleep(3000);
		}catch(InterruptedException obj4){
		}
		System.out.println(Thread.currentThread());
		// It shows Thread[Thread-0,5,Group]==Thread-0(current thread)5(Default priority),main=Group
	}
}
class ThreadDemo{
	public static void main(String[] args){
		Mythread obj=new Mythread();
		//obj.setPriority(7);
		obj.fun();
		obj.start();
		try{
			Thread.sleep(2000);
		}catch(InterruptedException obj1){

			
		}
		System.out.println(Thread.currentThread()); // getname shows here "main"
		// It shows Thread[main,5,main]==main(current thread)5(Default priority),main=group
		
		// SetName method to set threadname
		Thread.currentThread().setName("Viraj");

		System.out.println(Thread.currentThread()); 
	}
}
