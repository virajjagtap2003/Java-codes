// static is not inherit in interface

interface Demo{
	static void fun(){
		System.out.println("IN fun");
	}
}
class DemoChild implements Demo{
	                    // static is not inherit in interface
}
class Client{
	public static void main(String[] args){
		DemoChild obj=new DemoChild();
		obj.fun();    // cannot find symbol
	}
}



///// Static is inherit in class but it not override
/* class Demo{
 	static void fun(){
		System.out.println("Hii");
	}
}
class Demo1 extends Demo{
	
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun();
	}
}
*/
