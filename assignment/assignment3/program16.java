// write a program print number in reverse order using for loop


class Rev1{
	public static void main(String args[]){
		int no=94211423;
		int s=0;
		for(;no!=0;){
			int rem=no%10;
			s=s*10+rem;
			no=no/10;
		}
		System.out.println(s);
	}
}
