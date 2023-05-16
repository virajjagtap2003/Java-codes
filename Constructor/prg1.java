class Core{
	Core(){              // No argument constructor
		
		System.out.println("In Core");
	
	}
	void fun(){
		System.out.println("In Fun");
	}
	int x=10;  // Non static variable
	public static void main(String [] args){
		System.out.println("In main");
		Core obj=new Core();        	// Direct call to constructor when create an object of class
		obj.fun();                      // function need to call
		System.out.println(obj.x);
		System.out.println(obj.y);

	}
	int y=20;

}
