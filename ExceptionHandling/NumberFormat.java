//Number format exception

import java.io.*;
class Number{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		System.out.println(str);

		int no=Integer.parseInt(br.readLine());

		System.out.println(no);  // if user enter a string then number format exception occur
	}
}
