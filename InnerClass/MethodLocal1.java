// Class Inside method
// Compulsory need to create object in that method where class is created
class Outer{
	void m1(){
		System.out.println("IN m1 outer");

		class Inner{
			void m1(){
				System.out.println("In m1 inner");
			}
		}
		Inner obj=new Inner();
		obj.m1();

	}
	void m2(){
		System.out.println("In Outer m2");
	}
}
class Client{
	public static void main(String[] args){
		Outer obj=new Outer();
		obj.m1();
		obj.m2();
	}
}
