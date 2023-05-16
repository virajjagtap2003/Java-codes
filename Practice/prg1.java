class Check1{
	public static void main(String [] args){
		StringBuffer str=new StringBuffer("Viraj");
		System.out.println(System.identityHashCode(str));

		str.append("Jgatap");  //change into str  
		
		System.out.println(System.identityHashCode(str)); // hash code is same
		str.append(str);
		System.out.println(str);
              //
		String str1=new String("Viraj");
		str1.concat("jagtap");  // nothing change bcz concat need to store
		System.out.println(str1);
	}
}
