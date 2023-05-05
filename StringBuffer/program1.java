class StringBuffer1{
	public static void main(String [] args){
		String str="Viraj";  // On SCP (Immutable)
		StringBuffer str1=new StringBuffer("Viraj");   // Heap(mutable)
		System.out.println(System.identityHashCode(str1));
		str1.append("Jagtap");        // Not create another object change on that 
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

		System.out.println(str1.capacity());

		str1.append("JavaCore2web");

		System.out.println(System.identityHashCode(str1));


	}
}
