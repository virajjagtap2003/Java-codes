class Sequence{
	int x=12;
	static int y=20;
	Sequence(){
		System.out.println("In Demo Constructor");
	}
	static{
		System.out.println("In static block 1");
	}
	{
		
		System.out.println("In Instance block 1");
	}
	public static void main(String[] args){
		Sequence obj=new Sequence();
		System.out.println("In main");

		static{
			System.out.println("In static block 2");
		}
		{
			System.out.println("In Instance block 2");
		}
	}
}
