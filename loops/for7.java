// Check number is perfect number.6= 1+2+3=6 not 6

class Perfect{
	public static void main(String args[]){
	int n=496;
	int sum=0;
	for(int i=1;i<n;i++){
		if(n%i==0){
			sum=sum+i;		
		}
	}
	if(sum==n)
		System.out.println("Perfect number");
	else
		System.out.println("Not perfect ");
	}
}
