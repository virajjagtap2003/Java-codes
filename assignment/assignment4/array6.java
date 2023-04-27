// Take an array from user and reverse each element and print

import java.io.*;
class Reverse{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int s=0;
		for(int i=0;i<arr.length;i++){
			while(arr[i]!=0){
				int rem=arr[i]%10;
				s=s*10+rem;
				arr[i]=arr[i]/10;
			}
			System.out.print(s+"  ");
			s=0;
		}
	}
}
