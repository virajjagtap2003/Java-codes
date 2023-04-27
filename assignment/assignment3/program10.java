// write a program print square of even number using for loop

class Square1{
	public static void main(String args[]){
		int no=942111423;
		for(;no!=0;){
			int rem=no%10;
			if(rem%2==0){
				System.out.println(rem*rem);
			}
			no=no/10;
		}	
	}
}
