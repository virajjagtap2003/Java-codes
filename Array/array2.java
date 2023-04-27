// take 10 inputs from user store and print the elements
import java.io.*;
class Demo{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr[]=new int[5];
		System.out.println("Enter elements");
		for(int i=0;i<5;i++){

			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Display elements");
		for(int i=0;i<5;i++){
			System.out.println(arr[i]);
		}


	}
}
