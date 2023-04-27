 
 //check number is armstrong or not
class Armstrong{
	public static void main(String args[]){
		

	
		for(int no=1;no<=1000;no++){
			int temp=no;
			int count=0;
			while(temp!=0){                             // count the digits
				count++;
				temp=temp/10;
			}

			int sum=0;
			temp=no;
				
			while(temp!=0){
				int rem=temp%10;                // seperate digits
	
		
				int mult=1;                    // count times rotate loop
				for(int i=1;i<=count;i++){
					mult=mult*rem;
				}
				sum=sum+mult;

				temp=temp/10;             
			}

			if(sum==no){
				System.out.println(no);

			}		
			
		}
			
	}
}


