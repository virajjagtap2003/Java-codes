// Take array from user and find strong numbers and also print its index(sum of factorial of every digit)

import java.io.*;
class StrongIndex{
	public static void main(String args[])throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter array size");
			int size=Integer.parseInt(br.readLine());
			int arr[]=new int[size];
			System.out.println("Enter array elements");
			for(int i=0;i<arr.length;i++){
				arr[i]=Integer.parseInt(br.readLine());
			}
			int sum=0;
			int fact=1;
			
			for(int i=0;i<arr.length;i++){
				int temp=arr[i];	
				while(arr[i]!=0){
					int rem=arr[i]%10;
					for(int j=1;j<=rem;j++){
						fact=fact*j;
					}
					sum=sum+fact;
					fact=1;
					arr[i]=arr[i]/10;

				}
				if(sum==temp){
					System.out.println("Strong number "+temp+"found at "+i);
				}
				sum=0;
				


			}

	}
}
