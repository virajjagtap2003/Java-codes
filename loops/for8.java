 
 //check number is armstrong or not
class Armstrong{
	public static void main(String args[]){
		int no=370;
		int temp=no;
		int temp1=no;
		int count=0;
		
		while(no!=0){                             // count the digits
			count++;
			no=no/10;
		}

		int sum=0;
		
			
		while(temp!=0){
			int rem=temp%10;                // seperate digits
	
			
			int temp2=1;                    // count times rotate loop
			for(int i=1;i<=count;i++){
				temp2=temp2*rem;
			}
			sum=sum+temp2;
			temp2=1;
			temp=temp/10;             
		}
		
		if(temp1==sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");

		
	
		
				
				
		

	}
}
