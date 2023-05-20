class Student{
	int count=30;
	String College="RMD";

	void Submission(){
		String str1="Complete";
		String str2="Incomplete";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(count);
	}
	public static void main(String [] args){
		Student obj=new Student();
		obj.Submission();
		System.out.println(obj.College);
		
	}
}
