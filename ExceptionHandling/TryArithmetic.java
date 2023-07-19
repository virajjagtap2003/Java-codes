class Arith{

	public static void main(String[] args){
		System.out.println("Start");
		try{
			System.out.println(10/0);  // ArithmeticException obj=new ArithmeticException(); here created object is pass to obj in catch 
		 }catch(ArithmeticException obj){
			System.out.println("Exception occured");
		}
		System.out.println("End");

		

	}
}
