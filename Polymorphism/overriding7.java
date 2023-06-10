class Parent{
	public void fun(){
	
		System.out.println("In parent fun");
	}
}
class Child extends Parent{
	void fun(){               // Error Big to small
	 	System.out.println("In Child fun");
	}      
}
