class Parent{
	int x=10;
	Parent(){
		System.out.println("In parent constructor");
	}
	void access(){
		System.out.println("In parent Instance");
	}
}
class Child extends Parent{
	int y=20;
	Child(){
		System.out.println("In child constructor");
		System.out.println(x);
		System.out.println(y);
		access();   // access(this)

	}

}
class Client{
	public static void main(String [] args){
		Child obj=new Child();
		obj.access();
	}
}
