// password checking 
import java.util.*;
class InvalidPasswordException extends RuntimeException{
	InvalidPasswordException(String msg){
		super(msg);
	}
}
class Client{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter password ");
		System.out.println("Note: characters must contain uppercase");
		String str=sc.next();

		int flag=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			int val=(int)ch;
			if(val>=65 && val<=90){
				flag=1;
				
			}else{
				flag=0;
				break;
			}
		}
		if(flag==0){
			throw new InvalidPasswordException("password must contains uppercase");
		}
		else{
			System.out.println("Sucess");
		}
	}
}
