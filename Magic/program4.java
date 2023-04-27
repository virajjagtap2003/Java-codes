// print square of even digits of a given number


class Square{
	public static void main(String args[]){
		int no=2435;
		int squ=1;
		while(no!=0){
			int rem=no%10;
			if(rem%2==0){
				System.out.println(rem*rem);		
			}
			no=no/10;
		}
		
	}
}
