class Demo{
	int x=10;
	private int y=30;

	static int z=80;

	void disp(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
class mainDemo{
	public static void main(String [] args){
		Demo obj1=new Demo();
		Demo obj2=new Demo();

		obj1.disp();   // 10 30  80

		obj1.x=100;
		obj2.z=800;

		obj1.disp();  // 100  30  800
		obj2.disp();  // 10   30  800

	}
}
