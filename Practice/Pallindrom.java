// Pallindrom
class Pallindrom{
	public static void main(String[] args){
		int no=131;
		int s=0;
		int temp=no;
		while(no!=0){
			int rem=no%10;
			s=s*10+rem;
			
			 no=no/10;
		}
		if(temp==s){
			System.out.println("pallindrom");
		}else{
			
			System.out.println("not pallindrom");
		}

	}
}
