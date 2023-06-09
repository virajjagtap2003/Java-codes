class Demo{
	void fun(int x,float y){
		System.out.println("Int-float para");
	}
	void fun(float x,int  y){
		System.out.println("float-Int  para");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun(10,10); // Int float only in one fun otherwise ambiguity.
	}
}
