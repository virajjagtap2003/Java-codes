class Mythread extends Thread{
	public void run(){

		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());

	}
       /*public void start(){   // Tyanchya start method la override kel 
		System.out.println("In start");
		run();

	}*/
	public static void main(String[] args){
		Mythread obj=new Mythread();
		obj.start();
	
		System.out.println(Thread.currentThread().getName());
	}
}
