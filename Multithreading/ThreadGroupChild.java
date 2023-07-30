class Mythread extends Thread{
        Mythread(ThreadGroup tg,String str){
                super(tg,str);    // Thread class chya constructor la pass
        }
        public void run(){
                System.out.println(Thread.currentThread());
        }
}
class ThreadDemo{
        public static void main(String[] args){
                ThreadGroup PThreadGrp=new ThreadGroup("Languages");
                Mythread obj1=new Mythread(PThreadGrp,"c");    // threadName direct pass in mythread constructor then thread constructor 
                Mythread obj2=new Mythread(PThreadGrp,"JAVA");
                Mythread obj3=new Mythread(PThreadGrp,"Python");

                obj1.start();
                obj2.start();
                obj3.start();

		ThreadGroup CThreadGrp=new ThreadGroup(PThreadGrp,"Development");  // parent reference(PThread)
		Mythread obj4=new Mythread(CThreadGrp,"Flutter");
		Mythread obj5=new Mythread(CThreadGrp,"Spring");
		Mythread obj6=new Mythread(CThreadGrp,"React");

		obj4.start();
		obj5.start();
		obj6.start();
		
		
		ThreadGroup CThreadGrp1=new ThreadGroup(PThreadGrp,"Courses");  
		Mythread obj7=new Mythread(CThreadGrp1,"Fullstack");
		Mythread obj8=new Mythread(CThreadGrp1,"frontEnd");
		Mythread obj9=new Mythread(CThreadGrp1,"BackEnd");
		
		obj7.start();		
		obj8.start();		
		obj9.start();		

		System.out.println(PThreadGrp.activeCount()) ;  // how threads are active now
		System.out.println(PThreadGrp.activeGroupCount()); // active grps mostly child count
        }
}
