// Take array size from user and display jagged array.

import java.io.*;
class Jagged3{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter row Size");
		int r=Integer.parseInt(br.readLine());
		int arr[][]=new int[r][];
		int c=1;
		for(int i=0;i<arr.length;i++){
			
			System.out.println("Enter how many element to enter in"+"  "+c+"  "+"row");
			int n=Integer.parseInt(br.readLine());
			arr[i]=new int[n];
			c++;
		}

		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
