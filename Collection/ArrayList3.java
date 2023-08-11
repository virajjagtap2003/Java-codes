//Addiging user defined class in arraylist(IMP interview)
import java.util.*;
class CricPlayer{
	int jerNo=0;
	String Name=null;

	CricPlayer(int jerNo,String Name){
		this.jerNo=jerNo;
		this.Name=Name;
	}
	public String toString(){  // when we write user define class here need to write tostring method Otherwise it return address
		return jerNo+"  "+Name;
	}
	 
}
class ArrayUser{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		al.add(new CricPlayer(18,"virat"));
		al.add(new CricPlayer(7,"Dhoni"));
		al.add(new CricPlayer(45,"Rohit"));

		System.out.println(al);
	}

} 


