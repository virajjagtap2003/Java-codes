// calculate factorial of a given number using for loop

class Fact{
	public static void main(String args[]){
		int n=6;
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
