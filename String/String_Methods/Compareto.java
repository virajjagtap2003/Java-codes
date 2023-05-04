class CompareToDemo{       // Both are Equals then show 0 Otherwise Difference Between The ascii value of character
	public static void main(String args[]){
		String str1="VIRAJ";
		String str2="VIRAJ";

		System.out.println(str1.compareTo(str2));  //0

		String str3= "Viraj";
		String str4="vIraj";

		System.out.println(str3.compareTo(str4));  // 32

		
		  
	}
	
}
