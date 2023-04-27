// print armstrong numbers from 1 to 100

class Arm{
	public static void main(String args[]){
		int count=0;
		int mul=1;
		int sum=0;
		for(int no=1;no<=100000;no++){
			int temp=no;
			
			while(no!=0){
				count++;
				no=no/10;
			}
		
			no=temp;
			while(temp!=0){
				int rem=temp%10;
				
				for(int i=1;i<=count;i++){
					 mul=mul*rem;
			        }
				sum=sum+mul;
				mul=1;
				temp=temp/10;
			}

			
			if(sum==no)
				System.out.println(no);
			count=0;
			sum=0;
		}
		
	}
}
