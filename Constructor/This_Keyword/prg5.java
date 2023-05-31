// By using this call multiple constructor by creating one object

class Call{
	Call(){
		
		System.out.println("In No argument constructor");
		
	}
	Call(int x){
		this();
		System.out.println("In para constructor");
	}
	public static void main(String[] args){
		Call obj=new Call(10);
	}
}
