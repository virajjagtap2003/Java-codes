class Demo{
	int x=10;

	Demo(){              //Demo(Demo.this)
		System.out.println("In Constructor");
		System.out.println(this);        // Shows object address
		System.out.println(this.x);
	}

	void fun(){
		System.out.println(this);    // fun(Demo this)
		System.out.println(x);
	}
	public static void main(String [] args){
		Demo obj=new Demo();
		obj.fun();    // fun(obj)
		System.out.println(obj);    // this addres and object address is same
	}
}
