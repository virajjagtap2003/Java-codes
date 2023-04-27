// write a program print sum of all even numbers between 1 to 10 and print the multiplication of odd numbers


class Sum{
	public static void main(String args[]){
		int i=1;
		int sum=0;
		int mul=1;
		while(i<=10){
			if(i%2==0){
				sum=sum+i;
			}else{
				mul=mul*i;
			}
		i++;
		}
		System.out.println(sum);
		System.out.println(mul);
	}
}
