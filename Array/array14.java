/*WAP to search a specific element from an array and return its index. Input: 12456

Enter element to search: 4 Output: element found at index: 2*/

import java.io.*;
class IndexReturn{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());

		}
		System.out.println("Enter element to search");
		int no=Integer.parseInt(br.readLine());
		for(int i=0;i<arr.length;i++){
			if(arr[i]==no){
				System.out.println("Index of entered elements is="+i);
			}
		}
		
	}
}
