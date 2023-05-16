// Take String from user and reverse it.
import java.io.*;
class Reverse1{
	public static void main(String [] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str= br.readLine();
		char arr[]=str.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--){
			arr[str.length()-i-1]=str.charAt(i);
		
		}
	 	str=new String(arr); // Return type String
		System.out.println(str);

	

	}
}
