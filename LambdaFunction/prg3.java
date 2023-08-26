// Lambda function on runnable interface bcz runnable interface have only one method i.e run

class RunnableDemo{
	public static void main(String[] args){
		Runnable obj1=new Runnable(){
			public void run(){
				System.out.println(Thread.currentThread().getName());
			}
		};
		Runnable obj2=new Runnable(){
			public void run(){
				System.out.println(Thread.currentThread().getName());
			}
		};

		Thread t1=new Thread(obj1);
		t1.start();

		Thread t2=new Thread(obj2);
		t2.start();

	}
}
