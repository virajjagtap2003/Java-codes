/* WAP to take size of array from user and also take integer elements from user 
 * Print product of odd index only Input: Enter size: 
Enter array elements:123456 output=48*/

import java.io.*;
class IndexProduct{

	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array");

		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter array elements");
		int product=1;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(i%2!=0){
				product=product*arr[i];
			}
		}
		System.out.println("Product of odd index="+product);
	}
}
