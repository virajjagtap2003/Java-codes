// write a program to print number in reverse order using while loop
 
class Rev{
	public static void main(String args[]){
		int no=94211423;
		int s=0;
		while(no!=0){
			int rem=no%10;
			s=s*10+rem;
			no=no/10;
		}
		System.out.println(s);
	}
}
