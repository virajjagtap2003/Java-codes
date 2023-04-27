// check number is automorphic or not. .. square of number and check last digits equals to number or not (25=625)

class Automorphic{
	public static void main(String args[]){
		int no=76;
		int temp=no;
		int count=0;
		int s=0;
		int s1=0;
		int mul=no*no;
		while(no!=0){
			count++;
			no=no/10;
		}
		for(int i=1;i<=count;i++){
			int rem=mul%10;
			s=s*10+rem;          //52
			mul=mul/10;

		}
		while(s!=0){
			int rem1=s%10;
			s1=s1*10+rem1;
			s=s/10;
		}

		if(s1==temp){
			System.out.println("Automorphic number");
		}else{
			System.out.println("Not Automorphic number");
		}
	}
}
