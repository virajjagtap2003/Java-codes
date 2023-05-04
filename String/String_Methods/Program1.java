// Take two strings from user and use compare to
import java.io.*;
class compare{

	
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter first string");
		String str1=br.readLine();
		System.out.println("enter second string");
		String str2=br.readLine();
		
		if(str1.compareTo(str2)==0){
			System.out.println("0");
		}else{
			System.out.println(str1.compareTo(str2));
		}
		

	}
}


