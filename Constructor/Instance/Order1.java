class Instance{
	int x=10;
	Instance(){
		System.out.println("In Constructor");
	}
	{
		
		System.out.println("In Instance block 1");
	}
	public static void main(String[] args){
		Instance obj=new Instance();

		System.out.println("In main");
	}
	{
		System.out.println("in instance block 2");
	}
}
