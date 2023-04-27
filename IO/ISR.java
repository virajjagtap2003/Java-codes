// take a character using InputStreamReader(always take only single character)

import java.io.*;

class Isr{
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);

		System.out.println("Enter character");
		char ch=(char)isr.read();                // int ch=isr.read();  = A-65 (read always take integer)

		System.out.println(ch);
	}
}


