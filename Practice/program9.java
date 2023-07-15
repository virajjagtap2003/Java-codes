// Swapping of two numbers using third variable and without using third variable

class Swap{
	public static void main(String[] args){
		int a=10;
		int b=20;

		System.out.println("Before swap "+a+"  "+b);
		int temp=a;

		a=b;
		b=temp;

		System.out.println("After swap "+a+"  "+b);
	}

}
// Without using third variable


class Swap{
	public static void main(String[] args){
		int a=50;
		int b=700;

		System.out.println("Before swap "+a+"  "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("After swap "+a+"  "+b);
	}

}
