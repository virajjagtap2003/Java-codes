// Check Number is prime or not

class Prime{
	public static void main(String args[]){
		int n=7;
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		if(count==2)
			System.out.println("Number is prime");
		else
			System.out.println("Not prime");
	}
}


