/*Write a program to create an array of 'n' integer elements. Where 'n' value should be taken from the user.

Insert the values from users and find the sum of all elements in the array.*/

import java.io.*;
class Sum{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter n");
		int n=Integer.parseInt(br.readLine());
		int sum=0;
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			sum=sum+arr[i];
		}
		System.out.println("Sum of array elements="+sum);

	}
}
