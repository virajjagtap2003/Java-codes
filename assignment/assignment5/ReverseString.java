/*Write a program to reverse a String.
 input:- Core2web
 output: bew2eroc*/

class ReverseDemo{

	 void Reverse(String str){
		StringBuffer sb=new StringBuffer(str);
		StringBuffer sb1=sb.reverse();
		String rev=sb1.toString();
		System.out.println(rev);
	}

	
	public static void main(String [] args){
		String str="Core2Web";
		ReverseDemo obj=new ReverseDemo();
		obj.Reverse(str);
		
	}
}
