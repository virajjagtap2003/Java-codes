// mainly throw used for throw user defined exception. Here  we create user defined exception as same like predefined
import java.util.*;
class ThrowDemo{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();

		try{
			if(x==0){
				throw new ArithmeticException("divided by zero");
			}
			System.out.println(10/x);
		}catch(ArithmeticException obj){
			System.out.println("Exception in thread main:"+Thread.currentThread().getName()+" ");//by get name it shows the current thread(main)
			obj.printStackTrace();
			System.out.println(obj.toString());
			System.out.println(obj.getMessage());
		}


		
	}
}


