// Adding object of another class
import java.util.*;
class ITcomp{
	String  str=null;
	ITcomp(String compName){
		this.str=str;
	}
}
class ArrayListDemo{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10.3f);
		al.add("core");

		al.add(new ITcomp("Program"));  // this constructor is paramterised only so passing string e.g

		System.out.println(al);// it shows address of Itcomp method
	}
}
