// Take array inputs from user and print 2d array

import java.io.*;
class TwoDArray1{
	public static void main(String [] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter array dimensions");
		int r=Integer.parseInt(br.readLine());
		int c=Integer.parseInt(br.readLine());
		int arr[][]=new int[r][c];

		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println("Display array elements");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
}
