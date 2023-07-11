class Outer{
	int x=10;
	static int y=20;
	
	class Inner{
		int z=20;
		void fun2(){
			System.out.println("fun2 Inner");

			System.out.println(x); // here this is hidden(this.x) bcz Inner class have two parameters self this,outer this
			System.out.println(z); // here this is hidden (this.z)
			System.out.println(y);
			fun1();                  // here not an error bcz of this of outer class but from client this fun1 is not visible i.e(obj.fun1)

		}
	}
	void fun1(){
		System.out.println("outer fun1");
	}
}
class Client{
	public static void main(String[] args){
		Outer obj1=new Outer();
		Outer.Inner obj=obj1.new Inner();
		obj.fun2();
		
	}
}
