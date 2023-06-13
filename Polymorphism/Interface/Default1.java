interface Demo{
	void gun();
	default void fun(){  // default use for inherit or override method
		System.out.println("In fun");
	}
}
class ChildDemo implements Demo{
	public void gun(){
		System.out.println("In gun");
	}
	public void fun(){
		System.out.println("In fun");
	}

}
class Client{
	public static void main(String[] args){
	Demo obj=new ChildDemo();
	obj.fun();
	obj.gun();
}
}
