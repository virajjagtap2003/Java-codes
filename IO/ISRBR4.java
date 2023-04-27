// Enter Building name , wing , room no

import java.io.*;
class Isrbr4{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Building Name");
		String str=br.readLine();

		System.out.println("Enter Wing Name");
		char ch=(char)br.read();

		br.skip(1);					// to skip /n of wing name otherwise it throws number format exception

		System.out.println("Enter room no");
		int no=Integer.parseInt(br.readLine());
		
		System.out.println(str);
		System.out.println(ch);
		System.out.println(no);
	}
}
