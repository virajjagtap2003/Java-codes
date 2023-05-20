class MD{
	int items=20;
	String product="Burger";

	void order(){
		String menu1="Veg";
		String menu2="NonVeg";
	}
	
	
}
class user{
	public static void main(String [] args){
		MD obj=new MD();
		obj.order();
		System.out.println(obj.items);
	}
}
