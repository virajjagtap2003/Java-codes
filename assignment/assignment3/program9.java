// write program to print square of even digits using while loop

class Square{
	public static void main(String args[]){
		int no=942111423;
		
		while(no!=0){
			int rem=no%10;
			if(rem%2==0){
				System.out.println(rem*rem);
			}
			no=no/10;
		}
	}

}
