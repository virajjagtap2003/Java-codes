// print prime numbers from 1 to 100.

class Prime2{
	public static void main(String args[]){
	
		int count=0;
		for(int no=1;no<=100;no++){
			for(int i=1;i<=no;i++){
				if(no%i==0){
					count++;
				}
			}
			if(count==2){

				System.out.println(no);
			}
			count =0;

		}
	}
}
