//Given an intger value as an input
//print fizz if value is divisible by 3
//print buzz if value is divisible by 5
//print fizzbuzz divided by both
//if not print Not divisible


class Divisible1{
	public static void main(String[] args){
		int x=15;
		if (x%3==0 && x%5==0)
			System.out.println("FizzBuzz");
		else if(x%3==0)
			System.out.println("Fizz");
		else if(x%5==0)
			System.out.println("Buzz");
		else 
			System.out.println("Not divisible");
	}
}
