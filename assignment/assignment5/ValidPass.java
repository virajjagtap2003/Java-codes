// Write a Java method to check whether a string is a valid password(return true if password length is 
//greater than 8, it contains atleast one alphabet and number
import java.io.*;
class ValidPassword{
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter password");
		String str=br.readLine();
		int flagN=0;
		int flagA=0;
		char arr[]=str.toCharArray();
		if(arr.length>=8){
			for(int i=0;i<arr.length;i++){
				if( (arr[i]>='a'&& arr[i]<='z') ||( arr[i]>='A' && arr[i]<='Z')){
					flagA=1;
				}else if(arr[i]>=0){
					flagN=1;
				}
					
			}
		
		}else{
			System.out.println("Require atleast 8 characters");
		
		}
		if( (flagA==1)&&(flagN==1) ){
			System.out.println("Valid password");
		}else{
			System.out.println("Invalid password");
		}		
	}
}
