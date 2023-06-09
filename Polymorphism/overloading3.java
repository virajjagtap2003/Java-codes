//IMP
class Demo{
	void fun(double x){
		System.out.println("Int para");
	}	
	void fun(float ch){
	
		System.out.println("Float para");
	}
	/*void fun(char ch){
	
		System.out.println("char para");
	}*/


}
class Client{
	public static void main(String [] args){
		Demo obj=new Demo();
		obj.fun('A');         // first find exact match
	}
}
