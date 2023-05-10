class Demo{
	public static void main(String [] args){
		String str1="Viraj";
		String str2=new String("Jagtap");

		StringBuffer str3=new StringBuffer("Java");

//		String str4=str1.append(str3);  // Error string not have append it has concat

		StringBuffer str4= str3.append(str1); // In append without store it change but not in concat it need to store
		
//		String str4= str3.append(str1);     // Error Return type is stringbuffer(incompactible type )

		System.out.println(str1); //viraj
		System.out.println(str2);  //Jagtap
		System.out.println(str3);  //JavaViraj
		System.out.println(str4);  //JavaViraj
	}
}
