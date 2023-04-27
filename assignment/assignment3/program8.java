// count odd digits from a number using for loop

class Odd1{
	public static void main(String args[]){
		int no=942111423;
		int count=0;
		for(;no!=0;){
			int rem=no%10;
			if(rem%2!=0){
				count++;
			}
			no=no/10;
		}
		System.out.println(count);
	}
}
