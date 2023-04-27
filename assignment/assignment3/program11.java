// write a program print sum of all even numbers and multiplication of odd number.Between 1 to 10 using for loop

class Core{
	public static void main(String args[]){
		int sum=0;
		int mul=1;
		for(int i=1;i<=10;i++){
			if(i%2==0){
				sum=sum+i;
			}
			if(i%2!=0){
				mul=mul*i;
			}
		}
		System.out.println(sum);
		System.out.println(mul);
	}
}
