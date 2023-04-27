// check number is strong number or not ...   sum of factorial of every digit

class Strong{

	public static void main(String args[]){
		int no=145;
		int temp=no;
		int fact=1;
		int sum=0;
		while(no!=0){
			int rem=no%10;
			for(int i=1;i<=rem;i++){
				fact=fact*i;
			}
			 sum=sum+fact;
			 fact=1;
			 no=no/10;
		}
		if(sum==temp){
			System.out.println("Strong Number");
		}else{
			System.out.println("not strong number");
		}

		
	}
}
