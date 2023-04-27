// fibonacci series 0 1 1 2 3 5 8 13

class Fibonacci{
	public static void main(String args[]){
		int a=0;
		int b=1;
		int no=10;
		System.out.print(a+" "+b);
		for(int i=1;i<no;i++){
			int c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}

	}
}
