// Direct call by class name to static variable/method

class Call{
	static int x=10;
	static int y=20;

	static void disp(){
		System.out.println(x);
		System.out.println(y);
	}
}
class CallDemo{
	public static void main(String [] args){
		System.out.println(Call.x); // 10
		System.out.println(Call.y); // 20

 		Call.disp();                // 10  20
 
	}
}
