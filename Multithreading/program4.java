class Mythread extends Thread{
	public void run(){
		System.out.println("Run:"+Thread.currentThread().getName());
		for(int i=0;i<5;i++){
			System.out.println("In run");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException obj){
				System.out.println("Sucessful");
			}
		}
	}
}
class ThreadDemo{
	public static void main(String [] args)throws InterruptedException{
		Mythread obj1=new Mythread();
		obj1.start();
		System.out.println(Thread.currentThread().getName());

		for(int i=0;i<5;i++){
			System.out.println("In main");  // main thread is not sleep here so it will execute fast
		}

		}
	}

