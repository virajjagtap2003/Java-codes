class Parent{
	int x=10;
	static int y=20;
	Parent(){
		System.out.println("In parent constructor");
	}
}
class Child extends Parent{
	int x=100;
	static int y=200;

	Child(){
		
		System.out.println("In Child constructor");
	}

	void access(){
		System.out.println(x);  // 100
		System.out.println(y);  // 200
		System.out.println(super.x); //10  
		System.out.println(super.y); // 20
	}
}
class Client{
	public static void main(String[] args){
		Child obj=new Child();
		obj.access();
	}
}
