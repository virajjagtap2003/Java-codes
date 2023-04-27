/*WAP to find the number of even and odd integers in a given array of integers

Input: 1254678

Output:

Number of Even Elements: 4 Number of Odd Elements: 3*/

import java.io.*;
class Count{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter array elements");
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
				evenCount++;
			}
			else{
				oddCount++;
			}
		}
		System.out.println("Count of even Elements="+evenCount);
		System.out.println("Count od Odd elements="+oddCount);

	}
}
