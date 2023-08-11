// user defined example of stack overflow

import java.util.*;
class DataOverFlowException extends RuntimeException{ // need to extends parent
	 DataOverFlowException(String msg){
		super(msg);  // when we written a msg here our class not print it here we need to pass to the parent class (Throwable) so use super
	}
}
class DataUnderFlowException extends RuntimeException{
 	DataUnderFlowException(String msg){
		super(msg);
		
	}
}
class Client{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("enter integer no betweeen 1 to 100");
		
		for(int i=0;i<arr.length;i++){
			
			int no=sc.nextInt();
			if(no<0){
				throw new DataUnderFlowException("Value is below 0");
			}
			if(no>100){
				throw new DataOverFlowException("Value is greater than 100");
			}
			arr[i]=no;
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+"  ");
		}


	}
}

