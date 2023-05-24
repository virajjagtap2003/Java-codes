class Order{

	Order(){
		System.out.println("In constructor");
	}
	
	int x=10;
	static int y=20;

	static{
	
		System.out.println("In static block 1");
	}
	public static void main(String[] args){
		System.out.println("IN main");
		Order obj=new Order();            // Direct call to constructor

		System.out.println(obj.x);  

	}
	static{
		System.out.println("Static block 2");
		System.out.println(y);
		
	}
}

//In static block1
//In static block2
//20
//In main
//In constructor
//10

