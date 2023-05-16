class ConstructorDemo{
	ConstructorDemo(){
		System.out.println("In ConstructorDemo");
	}
	void fun(){
		ConstructorDemo obj=new ConstructorDemo();
	}
	public static void main(String [] args){
		ConstructorDemo obj1=new ConstructorDemo();
		ConstructorDemo obj2=new ConstructorDemo();
		obj1.fun();
	}
}
