// write a program print sum of all even digits and mul of odd numbers from 1 to 10. using while loop

class Core1{
	public static void main(String args[]){
		
		int sum=0;
		int mul=1;
		int i=1;

		while(i<=10){
			if(i%2==0){
				sum=sum+i;
			}
			if(i%2!=0){
				mul=mul*i;
			
		}
		i++;

	}
	System.out.println(sum);
	System.out.println(mul);
		
	}
}
