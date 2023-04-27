//Take array from user and check the pallindrom number and also print its index

import java.io.*;
class PallindromIndex{
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
			int temp=arr[i];
			while(arr[i]!=0){
				int rem=arr[i]%10;
				s=s*10+rem;
				arr[i]=arr[i]/10;
			}
			if(s==temp){
				System.out.println("pallindrom "+temp+"found at"+i);
			}
			s=0;

		}
	}
}
