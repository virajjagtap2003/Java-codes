//merge two arrays

import java.io.*;
class Merge{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of first array");
		int size1=Integer.parseInt(br.readLine());
		System.out.println("Enter size of second array");
		int size2=Integer.parseInt(br.readLine());

		int arr1[]=new int[size1];
		int arr2[]=new int[size2];
		int size3=size1+size2;

		System.out.println("enter first array elements");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter second array elements");
		for(int j=0;j<arr2.length;j++){
			arr2[j]=Integer.parseInt(br.readLine());
		}
		
		int arr3[]=new int[size3];
		for(int i=0;i<size1;i++){
			arr3[i]=arr1[i];
		}
		
		for(int i=0;i<size2;i++){
			arr3[size1+i]=arr2[i];
		}
		
		for(int i=0;i<arr3.length;i++){
			System.out.print("  "+arr3[i]);
		}		
		
	}
}


