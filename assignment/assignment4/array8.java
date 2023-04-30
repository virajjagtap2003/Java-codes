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

		}
	
		int m=arr[0];
		int m2=arr[1];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<m){
				m2=m;
				m=arr[i];
			}else{
				if(m>arr[i]){
					m2=arr[i];
				}
			}
		}
		System.out.println("Second Minimum="+m2);
		

	}
}

