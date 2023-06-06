
class Parent{
	private int x=10;
}
class child extends Parent{
	child(){
		System.out.println(this.x);
	}
}
class client{
	public static void main(String[] args){
		child obj=new child();

	}
}
