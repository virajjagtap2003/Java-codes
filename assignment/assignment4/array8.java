// Take an array and print secondmin element

import java.io.*;
class SecondMin{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());

		}}
		int min=arr[0];
		int smin=arr[0];
		for(int i=1;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		
		
		}
		for(int j=1;j<arr.length;j++){
			if(smin>arr[j] && arr[j]!=min){
				smin=arr[j];
			}
		}
	
		System.out.println("First Minimum="+min);
		System.out.println("Second Minimum="+smin);
		

	}
}
