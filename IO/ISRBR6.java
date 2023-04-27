// // Take first input from user and close stream for second input and check the error

import java.io.*;
class Isrbr6{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Employee name");
		String str=br.readLine();
		br.close();

		System.out.println("Enter salary");
		float sal=Float.parseFloat(br.readLine());

		System.out.println(str);
		System.out.println(sal);
	}
}

