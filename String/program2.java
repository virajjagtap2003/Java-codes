class HachCheck{
	public static void main(String args[]){
		String str="viraj";
		String str1="jagtap";
		String str2="virajjagtap";
		String str3=str+str1;
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		String str4=str.concat(str1);
		System.out.println(System.identityHashCode(str4));
		
		String str5="virajjagtap";
		System.out.println(System.identityHashCode(str5));


	}
}
