import java.util.*;
import Multi.Multiplication;
class Client{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();

		Multiplication obj=new Multiplication(a,b);
		System.out.println(obj.Ans());


	}
}
