//Take an array from user and find perfect numbers and also print its index.(sum of factors)

import java.io.*;
class PerfectIndex{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter array size");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr[i];j++){
				if(arr[i]%j==0){
					sum=sum+j;
				}
			}
			if(sum==arr[i]){
				System.out.println("perfect no "+arr[i]+"found at "+i);
			}
			sum=0;

		}
	}
}
