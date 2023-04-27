// check number is perfect numnber or not.. sum of factors(6=1+2+3)

class Perfect{
	public static void main(String args[]){
		int no=6;
		int sum=0;
		for(int i=1;i<no;i++){
			if(no%i==0){
				sum=sum+i;	
			}
		}
		if(sum==no)
			System.out.println(no+" is perfect number");
		else
			System.out.println(no+" is not perfect number");
	
	}
}
