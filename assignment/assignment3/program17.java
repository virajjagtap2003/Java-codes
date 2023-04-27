// write a program to check number is pallindrom or not

class Pallindrom{
	public static void main(String args[]){
		int no=2332;
		int temp=no;
		int s=0;
		while(no!=0){
			int rem=no%10;
			s=s*10+rem;
			no=no/10;

		}
		if(s==temp)
			System.out.println(temp+" is pallindrom number");
		else
			System.out.println(temp+" is not pallindrom number");
	}
}
