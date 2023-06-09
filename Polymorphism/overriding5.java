class Parent{
	char fun(){
		System.out.println("in parent fun");
		return 'S';
	}

}
class Child extends Parent{
	int fun(){
		System.out.println("In Child fun");
		return 10;
	}
}
class Client{
	public static void main(String[] args){
		Parent obj=new Child();
		//obj.fun(); // Error Return type not match

	}
}
