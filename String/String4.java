class StringDemo4{
	public static void main(String [] args){
		String str1="This is a String";
		String str2="This is a String";

		if(System.identityHashCode(str1)==System.identityHashCode(str2)){
			System.out.println("Equal");
		}else{

			System.out.println("Not Equals");
		}

            // 
	    String str3="This is a String";
	    String str4="a String";
	    String str5="This is"+str4;    // + (Concat) creates new object


		if(System.identityHashCode(str3)==System.identityHashCode(str5)){
			System.out.println("Equal");
		}else{

			System.out.println("Not Equals");
		}

	}
}
