class Demo{
	void fun(String str){
		System.out.println("String");
	}
	void fun(StringBuffer str1){
		System.out.println("StringBuffer");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun("Viraj");  //String 
		obj.fun(new StringBuffer("Core2web"));
	//	obj.fun(null); // ambiguity string and stringBuffer both have null so..i 

	}
}
