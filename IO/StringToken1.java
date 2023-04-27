// Take input on one line and display seperatly (details of cricket player)

import java.io.*;
import java.util.*;

class StringToken{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter player info");
		String info=br.readLine();

		System.out.println(info);

		StringTokenizer st=new StringTokenizer(info," ");
		String token1=st.nextToken();
		String token2=st.nextToken();
		String token3=st.nextToken();

		System.out.println("match info="+token1);
		System.out.println("player name="+token2);
		System.out.println("jer no="+token3);



	
	}
}
