// Take input from student to take his rollno

import java.io.*;
class Isrbr2{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter roll number");
		int no=Integer.parseInt(br.readLine());

		System.out.println(no);
	}
}
