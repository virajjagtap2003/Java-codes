interface Demo{
	void gun();
	void fun();
}
abstract class childDemo1 implements Demo{
	public void gun(){
		System.out.println("In gun");
	}
}
 class childDemo2 extends childDemo1{
	public void fun(){
		System.out.println("IN fun");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new childDemo2();      // These three ways to creat object 
		childDemo1 obj1=new childDemo2();
		childDemo2 obj2=new childDemo2();

		obj.fun();
		obj.gun();

	}
}
