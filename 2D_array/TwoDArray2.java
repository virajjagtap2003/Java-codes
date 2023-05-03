// Take array from user and print sum of all elements

import java.io.*;
class Jagged2{
	public static void main(String args[])throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter row size");
		int r=Integer.parseInt(br.readLine());
		int arr[][]=new int[r][];
	
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter how many elements in row "+(i+1));
			int n=Integer.parseInt(br.readLine());
			for(int j=0;j<arr[i].length;j++){
				arr[i]=new int[n];
			}
		}
		int sum=0;
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=Integer.parseInt(br.readLine());
				sum=sum+arr[i][j];
			}
		}
		System.out.println("Display elements");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Sum="+sum);

	}






















}
