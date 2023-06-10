class Parent{
	static void fun(){
		System.out.println("In parent fun");
	}
}
class Child extends Parent{
	static void fun(){
	
		System.out.println("In child fun");
	}
}
class Client{
	public static void main(String[] args){
		Parent obj1=new Parent();
		obj1.fun();

		Child obj2=new Child();
		obj2.fun();

		Parent obj3=new Child();  // Method hide for child so parent method call here
		obj3.fun();
	}
}
