// Take size of array from user and count the even and odd elements

import java.io.*;
class SumEven{
	public static void main(String args[])throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int counteven=0;
		int countodd=0;
		System.out.println("Enter array elements");

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
				counteven++;
			}
			else{
				countodd++;
			}

		}
		System.out.println("even couont="+counteven);
		System.out.println("odd count="+countodd);
		
		
	}
}
