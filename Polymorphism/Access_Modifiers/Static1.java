class Parent{
	static void fun(){
		System.out.println("In parent fun");
	}
}
class Child extends Parent{
	static void fun(){
		System.out.println("IN child fun");
	}
}
class Client{
	public static void main(String[] args){
		Parent obj1=new Parent();
		obj1.fun();
		Child obj2=new Child();
		obj2.fun();
		Parent obj3=new Child();
		obj3.fun();
	}
}
