class Mythread extends Thread{
	public void run(){
	
		for(int i=1;i<=10;i++)
		{
			
			try{
				Thread.sleep(2000);
			}catch(InterruptedException obj3){
			}
				System.out.println("In thread-0");
		}
	}
	void fun(){
		System.out.println("JAVA ");
	}

}
class ThreadDemo{
	public static void main(String[] args){
		Mythread obj=new Mythread();
		obj.start();
		try{
			
			obj.join();  // jya class la join kely to aadhi nantrr dusra sleep to sleep asla tri
		}catch(InterruptedException obj1){
		}

		for(int i=1;i<=10;i++){
			System.out.println("In main");
		}
	}
}
