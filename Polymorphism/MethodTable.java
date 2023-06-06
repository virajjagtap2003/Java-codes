class Parent{
	void fun(){
		System.out.println("In fun");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("In child ");
	}
	void gun(){
	
		System.out.println("In gun ");
	}
}
class Client{
	public static void main(String[] args){
		Parent obj1=new Parent();
		obj1.fun();
//		obj1.gun(); // In parent method table gun not found
		
		Child obj2=new Child();
		obj2.gun();
		obj2.fun();
	}
}
	

