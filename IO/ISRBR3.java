// Take a input of two students print names and roll no
 import java.io.*;
 class Isrbr3{
 	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Student1 name");
		String str1=br.readLine();

		System.out.println("Enter Student2 name");
		String str2=br.readLine();

		System.out.println("Enter student1 roll no");
		int no1=Integer.parseInt(br.readLine());

		System.out.println("Enter student2 roll no");
		int no2=Integer.parseInt(br.readLine());

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(no1);
		System.out.println(no2);

		
	}	
 }	
