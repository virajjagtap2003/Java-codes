interface Demo{
	void fun();  //  public void fun
	void gun();  // public void gun
}
class ChildDemo implements Demo{
	public void fun(){
		System.out.println("In  child-fun");
	}
	public void gun(){
		System.out.println("In  child-gun");
	}
}
class Client{
	public static void main(String[] args){
		ChildDemo obj=new ChildDemo();
		obj.fun();
		obj.gun();
	}
}
