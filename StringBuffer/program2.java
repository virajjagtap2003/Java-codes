class BufferDemo{
	public static void main(String args[]){
		StringBuffer str1=new StringBuffer("Viraj");
		System.out.println(str1.capacity()); //21
		str1.append("Jagtap");

		System.out.println(str1.capacity());//21
		str1.append("abhipawrr");

		System.out.println(str1.capacity());

		str1.append("Core");// size is greater than21 so it is 2*21+2=44

		System.out.println(str1.capacity());
		str1.append("Web");// 27 is less than 44 so size is 44

		System.out.println(str1.capacity()); // when capacity is greater than 44 it will be 44*2+2

	}
}
