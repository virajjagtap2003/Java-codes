// check number is armstrong or not

 class Armstrong1{
 	public static void main(String args[]){
		int no=1553;
		int temp=no;
		int temp2=no;
		int sum=0;
		int count=0;
		int mul=1;

		while(no!=0){
			count++;   //3
			no=no/10;
		}
		while(temp!=0){

			int rem=temp%10;
			for(int i=1;i<=count;i++){
				 mul=mul*rem;
			}
			sum=sum+mul;
			mul=1;
			temp=temp/10;
		}
		if(sum==temp2)
			System.out.println(temp2+" is armstrong number");
		else
			System.out.println(temp2+" is not armstrong number");
	}
 }
