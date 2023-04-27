// Take details of scoity on one line and display on seperate line

import java.io.*;
import java.util.*;
class StringToken2{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter scoity details");
		String info=br.readLine();

		System.out.println(info);

		StringTokenizer st=new StringTokenizer(info," ");
		String token1=st.nextToken();
		String token2=st.nextToken();
		String token3=st.nextToken();

		System.out.println("Scoity Name="+token1);
		System.out.println("Wing Name="+token2);
		System.out.println("Room no="+token3);

	}
}
