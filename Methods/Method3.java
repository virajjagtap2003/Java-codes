// Take array from user and print prime numbers using function calling

import java.io.*;
class Prime1{
		
		static void prime(int xarr[]){
			int count=0;
			for(int j=0;j<=xarr.length;j++)
				for(int z=1;z<=xarr[j];z++){
					if(xarr[j]%z==0){
						count++;
				}
			}
		}
			if(count==2){
				System.out.println("Prime="+x);	
			}
			count=0;
		
				
		}




	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter size of array");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		

		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			

		}
		for(int i=0;i<arr.length;i++){
			arr[i]=prime(arr);
		
		}
	}
}
