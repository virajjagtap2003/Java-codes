// Take a string from user and reverse it

import java.io.*;
class ReverseDemo{
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str=br.readLine();

//		str.reverse();// error cannot find symbol
		StringBuffer str1=new StringBuffer(str);
		System.out.println(str1.reverse());     // Return type StringBuffer

		String str2=str1.toString();    // Method Chaining (toString means convert StringBuffer to string)
		System.out.println(str2);      // Return type String
	}
}
