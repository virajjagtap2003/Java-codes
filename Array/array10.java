// Take array from user and print those elements which are divisible by 5

import java.io.*;
class Divisible{
	
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			
			if(arr[i]%5==0){
				System.out.println("Divisible by 5="+arr[i]);
			}
		
	}
}
}
