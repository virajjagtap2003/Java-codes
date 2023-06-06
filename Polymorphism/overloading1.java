class Demo{
	void fun(int x){
		System.out.println(x);
	}

	void fun(float y){
		System.out.println(y);
	}
	void fun(Demo z){
		System.out.println("In Demo parameter");
	}
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun(10);
		obj.fun(10.2f);
		obj.fun(obj); // address pass to z
	}
}
