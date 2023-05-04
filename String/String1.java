class StringDemo1{
	public static void main(String [] args){
		String str1="Viraj";       // goes on String constant pool
		String str2="Jagtap";
		String str3=new String("Abhishek");  // Goes on Heap

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));

		String str4="Viraj";
		System.out.println(System.identityHashCode(str4));  // SCP

		char str5[]={'V','I','R','A','J'};
		System.out.println(str5);


	}
}
