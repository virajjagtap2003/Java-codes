/*Write a program, take 7 characters as an input, Print only vowels from the array Input: abcodpe

Output: 209 */

import java.io.*;
class Vowels{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size=Integer.parseInt(br.readLine());
		char arr[]=new char[size];
		
		System.out.println("enter array character");
		for(int i=0;i<size;i++){
			arr[i]=(char)br.read();
			br.skip(1);            // for skip \n
				
		}	
		for(int i=0;i<size;i++){
			if(arr[i]=='a'|| arr[i]=='A'||
			   arr[i]=='e'|| arr[i]=='E'||
			   arr[i]=='i'|| arr[i]=='I'||
			   arr[i]=='o'|| arr[i]=='O'||
			   arr[i]=='u'|| arr[i]=='U'){
			   	
				System.out.println("Vowels from an array="+arr[i]);
			   }
		}
	}
}


