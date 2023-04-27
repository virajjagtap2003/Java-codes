// check number is pallindrom or not

class Pallindrom{
	public static void main(String args[]){
		int no=1221;
		int temp=no;
		int s=0;
		while(no!=0){
			int rem=no%10;
			s=s*10+rem;
			no=no/10;
		}
		if(s==temp)
			System.out.println("number is pallindrome");
		else
			System.out.println("number is not pallindrom");
	}
}
