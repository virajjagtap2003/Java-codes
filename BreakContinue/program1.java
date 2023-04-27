// check number is prime or not

class Prime{
	public static void main(String args[]){
		int no=66;
		int count=0;
		for(int i=1;i<=no;i++){
			if(no%i==0){
				count++;	
			}
			if(count>2){
				break;
			}
		}
		if(count==2){
			System.out.println("number is prime");

		}else{
			System.out.println("number is not prime");
		}
	}
}
