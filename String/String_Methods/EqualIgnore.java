// content check (case ignored)

class EqualIgnoreCaseDemo{
	public static void main(String args[]){
		String str1="VIRAJ";
		String str2="viraj";

		System.out.println(str1.equalsIgnoreCase(str2));

		String str3=new String("viraj");

		System.out.println(str2.equalsIgnoreCase(str3));
	}
}
