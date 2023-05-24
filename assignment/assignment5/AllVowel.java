//Write a method that checks whether all the characters in a given string are vowels (a, e,i,o,u) or not

import java.io.*;
class CheckVowel{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str=br.readLine();

		char arr[]=str.toCharArray();
		int flag=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a'||  arr[i]=='A' || 
			   arr[i]=='e'||  arr[i]=='E' ||
			   arr[i]=='i' || arr[i]=='I' ||
			   arr[i]=='o' || arr[i]=='O' ||
			   arr[i]=='u' || arr[i]=='U'){
			   
			 	flag=1;  	
			}else{
				flag=0;
				break;
			}
		}
		if(flag==1){
			System.out.println("True");
		}else{
		
			System.out.println("False");
		}
	}
}
