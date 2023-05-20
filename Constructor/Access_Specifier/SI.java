class Employee{
	int id=100;
	String name="Viraj";

	static int y=200;

	void disp(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(y);
	}
}
class EmployeeDemo{
	public static void main(String [] args){
		Employee obj1=new Employee();
		Employee obj2=new Employee();
		obj1.disp();
		
		System.out.println(obj1.id);   //100
		System.out.println(obj1.name); // Viraj
		System.out.println(obj1.y);     //200

		obj1.id=300;
		obj1.name="Abhi";
		obj1.y=500;

		System.out.println(obj1.id);  //300
		System.out.println(obj1.name); //Abhi
		System.out.println(obj1.y);    //500

		System.out.println(obj2.id);   //100
		System.out.println(obj2.y);   //500
		System.out.println(obj2.name); //Viraj



	}
}
