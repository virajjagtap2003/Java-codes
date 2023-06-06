class Parent{
	int x=10;
	static int y=20;

	Parent(){
		System.out.println("In parent constructor");
	}
	void fun(){
		
		System.out.println("In Fun");
	}
	static void run(){
		
		System.out.println("In run");
	}
}
class Child extends Parent{
	void gun(){
		
		System.out.println("In gun");
		System.out.println(x);

	}

}
class Client{
	public static void main(String[] args){
		Parent obj1=new Parent();
		//obj1.gun() =Error cannot find symbol
		
		Child obj2=new Child();
		obj2.gun();
		System.out.println(obj2.x);
		System.out.println(obj2.y);

	}
}

