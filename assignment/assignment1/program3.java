// According to month print number of days.

class Days{
	public static void main(String args[]){
		int x=0;

		if(x==0 || x<0 || x>12)
			System.out.println("Invalid input");
		else if(x==1)
			System.out.println("Jan has 31 days");
		else if(x==2)
			System.out.println("Feb has 29 days");
		else if(x==3)
			System.out.println("march has 31 days");
		else if(x==4)
			System.out.println("april has 30 days");
		else if(x==5)
			System.out.println("may has 31 days");
		else if(x==6)
			System.out.println("june has 30 days");
		else if(x==7)
			System.out.println("july has 31 days");
		else if(x==8)
			System.out.println("August has 30 days");
		else if(x==9)
			System.out.println("sep has 31 days");
		else if(x==10)
			System.out.println("oct has 30 days");
		else if(x==11)
			System.out.println("nov has 31 days");
		else if(x==12)
			System.out.println("december has 30 days");
		else 
			System.out.println("Invalid");
	}
}
