class Mythread extends Thread{
	Mythread(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
class ThreadDemo{
	public static void main(String[] args){
		ThreadGroup PThreadGrp=new ThreadGroup("Languages"); // languages name cha parent thread grp created
		Mythread obj1=new Mythread(PThreadGrp,"c");  // c thread add into parent threadgroup languages 
		Mythread obj2=new Mythread(PThreadGrp,"JAVA");
		Mythread obj3=new Mythread(PThreadGrp,"Python");

		obj1.start();
		obj2.start();
		obj3.start();
	}
}

