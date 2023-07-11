class Outer {
	int a=10;
	static int y=20;

	void m1(){
		int a=30;
		static int b=40; // error static only decalre in class
	}

	public static void main(String [] args){
		int p=40;
		static int q=80;  // same error
	}
}

//static is not allowed in inner class
 
class Outer{
	int a=10;
	static int b=20;

	class Inner{
		int z=90;
		static int u=30;  // error
	}
}
