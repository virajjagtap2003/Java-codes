class Parent{
	Parent(){
		System.out.println("In parent constructor");
	}
	void Property(){
		
		System.out.println("Car,Home,Gold");
	}
	void Marry(){
		
		System.out.println("Deepika");
	}
}
class Child extends Parent{
	
	Child(){
		System.out.println("In child constructor");
	}
	void Marry(){
		
		System.out.println("Aalia");
	}
}
class Client{
	public static void main(String[] args){
		Child obj=new Child();
		obj.Marry();

	}
}
