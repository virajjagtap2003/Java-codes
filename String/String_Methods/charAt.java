 // Returns the character at the index which is return
import java.io.*;
class CharAtDemo{

	 char mycharAt(String str)throws IOException{
		char arr[]=str.toCharArray();
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter index to return the character from string");
                int n=Integer.parseInt(br.readLine());

		if(n<arr.length){
			for(int i=0;i<arr.length;i++){
				if(i==n){
					return arr[i];
				}
			}
		}else{
			System.out.println("Wrong Index");
	
		}
		return '\0';
	}	
	public static void main(String args[])throws IOException{
		String str="VIRAJ";
	      /* System.out.println(str.charAt(2));	
	       System.out.println(str.charAt(3));	
	       System.out.println(str.charAt(4));*/

		// without using inbuild method
	/*	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter index to return the character from string");
		int n=Integer.parseInt(br.readLine());*/
		CharAtDemo obj=new CharAtDemo();
		char ch=obj.mycharAt(str);
		System.out.println(ch);
	}
}
