/*WAP to take size of array from user and also take integer elements from user Print sum

elements only Input: Enter size: 5

Enter array elements:12345*/

import java.io.*;
class ArrayDemo{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of array");
		int size=Integer.parseInt(br.readLine());
		int sum=0;
		int arr[]=new int[size];

		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			sum=sum+arr[i];
		}
		System.out.println("Sum of elements="+sum);

	}
}
