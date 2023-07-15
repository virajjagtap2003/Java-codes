class NullPoint{
	void m1(){
		System.out.println("In m1");
	}
	void m2(){
		System.out.println("In m2");
	}
	public static void main(String[] args){
		NullPoint obj=new NullPoint();
		obj.m1();
		obj=null;
		obj.m2();  // nullpointer exception
	}
}
