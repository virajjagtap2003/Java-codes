// create using runnable

 class Mythread implements Runnable{
 	public void run(){
		try{
			Thread.sleep(3000);
		}catch(InterruptedException ie){
		//	System.out.println(ie.toString());	
		}
		System.out.println(Thread.currentThread());
	}
 }
class ThreadDemo{
	public static void main(String[] args){
		ThreadGroup PThreadGrp=new ThreadGroup("India");

		Mythread obj1=new Mythread();
		Mythread obj2=new Mythread();
	
		Thread t1=new Thread(PThreadGrp,obj1,"Maharashtra");   // thread constructor have 3 parameters}
	
		Thread t2=new Thread(PThreadGrp,obj2,"Goa");

                 
		 t1.start();
		 t2.start();
		 System.out.println(PThreadGrp.activeCount());
		 System.out.println(PThreadGrp.activeGroupCount());
	}
}
