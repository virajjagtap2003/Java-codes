// Take array from user and print sum of all odd elements 

import java.io.*;
class OddSum{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());
		int sum=0;
	
		int arr[]=new int[size];

		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());

			if(arr[i]%2!=0){
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum of odd elements="+sum);

	}
}
