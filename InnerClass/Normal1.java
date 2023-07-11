// Parent of both classes is object class
class Outer{
	class Inner{
		void fun2(){
			System.out.println("In Inner fun2");
		}
	}
	void fun1(){
		System.out.println("In outer fun1");
	}
}
class Client{
	public static void main(String[] args){
		Outer obj=new Outer();                // 1st method 
		Outer.Inner obj1=obj.new Inner(); //
		//Outer.Inner obj1=new Outer().new Inner();
		obj1.fun2();
		obj.fun1();
		
	}
}
