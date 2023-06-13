class Parent{
	final void fun(){
		System.out.println("v");
	}
}
class Child extends Parent{
	void fun(){
		System.out.println("d");
	}
}
class Client{
	public static void main(String[] args){
		Parent obj=new Child();
		obj.fun();
	}
}
