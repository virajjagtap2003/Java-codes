class StringDemo3{
	public static void main(String [] args){
		String str1=new String("JAVA");
		String str2="JAVA";

		System.out.println(str1==str2);	// It checks the identityhasshCode (return type boolean)
		System.out.println(str1.equals(str2));  // Checks content (Return TYpe boolean)

		String str3=new String("Viraj");
		String str4=new String("Viraj");

		System.out.println(str3==str4);	// It checks the identityhasshCode (return type boolean)


	}
}
