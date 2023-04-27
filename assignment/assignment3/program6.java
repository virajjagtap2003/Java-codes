// count number of digits using for loop

class Count1{
	public static void main(String args[]){
		int no=94211423;
		int count=0;
		for(;no!=0;){
			count++;
			no=no/10;
		}
		System.out.println(count);
	
	}
}
