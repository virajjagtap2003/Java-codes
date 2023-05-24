// Java Support global static variable

class Scope{
	static int x=10;    // True

	static{
		static int x=20;  // error
	}

	static void fun(){
		static int z=30;  // error

	}
	void fun2(){
		static int v=40;  //error
	}

}
