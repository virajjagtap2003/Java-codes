class StringDemo2{
	public static void main(String [] args){
		String str1="Core2Web";
		String str2=str1;

		System.out.println(str1);
		System.out.println(str2);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		

		String str3=new String(str2);

		System.out.println(System.identityHashCode(str3));

	}	
}
