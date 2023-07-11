// To slove the prb of static declaration in inner class
class Outer {
	int x=10;
	static int y=20;
	
	class Inner{
		final static int z=30;
	}
}
class Client1{
	public static void main(String[] args){
		Outer obj=new Outer();

		Outer.Inner obj1=obj.new Inner();

		System.out.println(obj1.z);
	}
}
