// Take array from user and find the composite number and print its index also(factors greater than 2)

import java.io.*;
class CompositeIndex{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter array elements");
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
			if(count>2){
				System.out.println("Composite "+arr[i]+"Found at  "+i);
			}
			count=0;
		}

	}	

}
