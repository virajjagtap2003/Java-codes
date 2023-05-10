class Demo1{
	public static void main(String [] args){
		String str1="Amazon";
		String str2=new String("Microsoft");

		StringBuffer str3=new StringBuffer("Google");

//		String str4= str1.concat(str3); // concat require only string parameter so error
		
		StringBuffer str5=str3.append(str2);

		System.out.println(str1); // Amazon
		System.out.println(str2); // Microsoft
		System.out.println(str3); //GoogleMicrosoft
//		System.out.println(str4); //error
		System.out.println(str5); //GoogleMicrosoft
	}
}
