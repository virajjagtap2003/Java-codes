// we can write multiple exception in one catch but only child exceptions are allowed not the parent

import java.util.*;
class Demo{
	public static void main(String[] args ){
		Scanner sc=new Scanner(System.in);

		try{
			int data=sc.nextInt();
		}catch(NullPointerException | IndexOutOfBoundsException obj){
			System.out.println("Exception handled");
		}
	}
}
