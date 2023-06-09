class Demo{
	void fun(Object obj){
		System.out.println("Object");
	}
	void fun(String str){
		System.out.println("String");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun("Viraj");

		obj.fun(new StringBuffer("Core"));// object class in main parent so it store all unmatch parameters
	}
}
