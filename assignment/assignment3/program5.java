// count number of digits of a given number using while loop

class Count{
	public static void main(String args[]){
		int no=94211423;
		int count=0;
		while(no!=0){
			count++;
			no=no/10;
		}
		System.out.println(count);
	}
}
