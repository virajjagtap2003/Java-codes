/*Write a Java program to find the sum of oven and odd numbers in an array.

Display the sum value.

Input: 11 12 13 14 15

Output

Odd numbers sum-39 Even numbers sum = 26*/

import java.io.*;
class Sum1{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter array elements");
		int evenSum=0;
		int oddSum=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
				evenSum=evenSum+arr[i];
			}
			else{
				oddSum=oddSum+arr[i];
			}
		}
		System.out.println("EvenSum="+evenSum);
		System.out.println("oddSum="+oddSum);


	}
}
