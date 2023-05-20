class Demo{
	 	int x=10;
		private int y=20;

		void Acess(){
			System.out.println(x);
			System.out.println(y); // Private variable access in class
		}

}
class MainDemo{
	public static void main(String[] args){
		Demo obj=new Demo();
		System.out.println(obj.x); //10
//		System.out.println(obj.y); // Error

		obj.Acess();

	}
}

