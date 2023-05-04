// same as compareTo only case is ignored
// paramenter- string 
// return type - integer

class IgnoreCase{
	public static void main(String [] args){
		String str1="Viraj";
		String str2="VIRAJ";

		System.out.println(str1.compareToIgnoreCase(str2));

		String str3="Jagtap";
		String str4="viraj";

		System.out.println(str3.compareToIgnoreCase(str4));


		String str5="SHASHI";
		String str6="shashikant";    // This condition letters and extra to compare so it returns count of extra digits

		System.out.println(str5.compareToIgnoreCase(str6));
	}
}
