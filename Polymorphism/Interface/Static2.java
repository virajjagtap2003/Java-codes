interface Demo1{
	static void fun(){
		System.out.println("in fun demo1");
	}
}
interface Demo2{
	static void fun(){
		System.out.println("In fun Demo2");
	}
}
class ChildDemo implements Demo1,Demo2{   // Demo1 & Demo2 static is not inherit here so no ambiguity
	void fun(){             
		System.out.println("In fun ChildDemo");
		Demo1.fun();   // call static by interface name
	}
}
class Client{
	public static void main(String[] args){
		ChildDemo obj=new ChildDemo();
		obj.fun();
	}
}
