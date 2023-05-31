class Access{
	int x=10;  //Global

	Access(){  // Access(Access this)
		System.out.println("In no argument constructor");
	}
	Access(int x){  //local   Access(Access this,int x)
		System.out.println("In paramenterised");
	}
	public static void main(String[] args){
		Access obj1=new Access();  // Access(obj1)
		Access obj2=new Access(20); // Access(obj2,10)
	}
}
