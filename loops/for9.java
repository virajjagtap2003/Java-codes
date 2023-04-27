// Check number is pallindrom or not using for loop

class Pallindrom{
	public static void main(String args[]){
		int no=1221;
		int s=0;
		int temp=no;
		for(;no!=0;){
			int rem=no%10;
			s=s*10+rem;
			no=no/10;

		}
		if(s==temp){
			System.out.println("Pallindrom");
		}else{
			System.out.println("Not pallindrom");
		}
	}
}
