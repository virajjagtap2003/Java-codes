//Take an array from user and find prime elements and print and index also

import java.io.*;
class PrimeIndex{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<=arr[i];j++){
				if(arr[i]%j==0){
					count++;
				}
			}
			if(count==2){
				System.out.println("Prime "+arr[i]+"found at "+i);
			
			}
			count=0;
		}
	}
}
