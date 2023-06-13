interface Demo1{
	default void fun(){
		System.out.println("In fun Dmeo1");
	}
}

interface Demo2{
	default void fun(){
		System.out.println("In fun Dmeo2");
	}
}

class DemoChild implements Demo1,Demo2{
	public void fun(){          // performing override bcz same method
		System.out.println("In fun demochild");
	}
}
class Client{
	public static void main(String[] args){
		DemoChild obj =new DemoChild();
		obj.fun();

		Demo1 obj1=new DemoChild();
		obj1.fun();
	}
}
