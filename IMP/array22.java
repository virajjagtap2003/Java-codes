//Take array from user and check armstrong number and also print its index

import java.io.*;
class ArmstrongIndex{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++){
			int count=0;
			int temp=arr[i];
			int temp2=arr[i];

			int mul=1;
			int s=0;
			while(arr[i]!=0){
				count++;
				arr[i]=arr[i]/10;
			}
			while(temp!=0){
			int rem=temp%10;
			for(int j=1;j<=count;j++){
				mul=mul*rem;
			}
			s=s+mul;
			mul=1;
			temp=temp/10;

			}

			if(s==temp2){
				System.out.println("Armstrong  "+temp2+" found at  "+i);
			}
		}
		
	}
}
