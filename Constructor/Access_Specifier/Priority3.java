class OrderDemo{
	static{
		System.out.println("static block 1");
	}
	public static void main(String[] args){
		
		System.out.println("In OrderDemo main");
	}
}
class call{
	static {
		
		System.out.println("static block 2");
	}
	
	public static void main(String[] args){
		
		System.out.println("In call main");
	}
	static{
		
		System.out.println("static block 3");
	}
	}


// java Orderdemo = static block 1    in orderDemo main
//java call = static block 2     static block 3  in call main
