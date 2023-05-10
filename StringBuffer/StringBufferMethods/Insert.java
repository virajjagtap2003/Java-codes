// Insert (int offset,string str) (int= place to insert string in buffer, string = String to insert)

class InsertDemo{
	public static void main(String [] args){
		StringBuffer str=new StringBuffer("Viraj");

		System.out.println(str);

		str.insert(5,"jagtap"); // If index not found (error=array index out of bound)
		System.out.println(str);
	}
}
