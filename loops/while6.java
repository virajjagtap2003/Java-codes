//  count number of digits

class Digits{
	public static void main(String args[]){
	int no=33333244;
	int count=0;
	while(no!=0){
		
		count++;
		no=no/10;
	}
		System.out.println(count);
	}
}
