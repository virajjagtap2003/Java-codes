class Parent{
	Parent(){
		System.out.println("In parent constructor");
	}
	void ParentProperty(){
		System.out.println("Car,Home");
	}
}
class Child extends Parent{
	Child(){
		//Super
		System.out.println("In child constructor");
	}
}
class Client{
	public static void main(String[] args){
	
		Parent obj1=new Parent();
		obj1.ParentProperty();

		Child obj2=new Child();
		obj2.ParentProperty();
	}
}
