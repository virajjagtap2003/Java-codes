// compare string and print special characters if present
import java.io.*;
class DemoString{
	public static void main(String[] args)throws IOException{
		System.out.println("enter String");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
			
		char arr1[]=new char[100];
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++){
				arr1[i]=arr[i];
			}
		}
		System.out.println("display");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr1[i]);
		}
	}
}
