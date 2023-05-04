class Concat1{
	public static void main(String [] args){
		String str1="Viraj";
		String str2="Jagtap";

		String str3=str1+str2;      // It calls the append method from stringBuilder class (everytime creates new object like concat in scp)
		System.out.println(str3);
		String str4=str1.concat(str2);  // create new object(not connect with str3 object)

		System.out.println(str3);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));


		
	}
}
