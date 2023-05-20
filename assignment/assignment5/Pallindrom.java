// check the string is pallindrom or not

class PallindromDemo{
	public static void main(String []args){
	String str="radar";
	String temp=str;

	StringBuffer sb=new StringBuffer(str);
	StringBuffer rev=sb.reverse();

	String str1=rev.toString();

	if(temp.equals(str1)){
		System.out.println("String is pallindrom");
	}else{
		System.out.println("String is not pallindrom");
	}
	}


}
