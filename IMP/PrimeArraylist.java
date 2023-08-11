// print 1 to n prime numbers seperated by ,

class Prime{
	public static void main(String[] args){
		int n=10;
		int count=0;
		
		for(int no=1;no<=n;no++){
			for(int i=1;i<=no;i++){
				if(no%i==0){
					count++;
				}
			}
			if(count==2){
				System.out.print(no);
				if(no<n){
					System.out.print(",");
				}
			}
			
			count=0;
			
		}
		
	}
}
