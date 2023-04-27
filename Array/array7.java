//Take array from user and product of even elements

import java.io.*;
class EvenProduct{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter array elements");
		int product=1;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
				product=product*arr[i];
			}
		}
		System.out.println("product of even elements="+product);
		


			
	}
}	
