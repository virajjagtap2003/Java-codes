class FunctionDemo{
	int x=10;
	static int y=20;

	void fun1(){
		System.out.println(x);
		System.out.println(y);
	}
	static void fun2(){
		//System.out.println(x);  // nonstatic x cannot be reference from static context
		System.out.println(y);
	}
}

class mainDemo{
	public static void main(String[] args){
		//fun1();  // cannot find symbol
		
		FunctionDemo obj=new FunctionDemo();
		obj.fun1();   // call by object
		obj.fun2();

		FunctionDemo.fun2(); // only static method access by class name
		//FunctionDemo.fun1(); // Error 

		
	}
}
