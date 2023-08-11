// sorted set
import java.util.*;
class TreeDemo{
	public static void main(String[] args){
		TreeSet ts=new TreeSet();
		ts.add(30);
		ts.add(20);
		ts.add(50);
		ts.add(10);

		System.out.println(ts);  // print in sorted order
		
		TreeSet ts1=new TreeSet();
		ts1.add("kanha");
		ts1.add("rohan");
		ts1.add("addi");
		ts1.add("viraj");

		System.out.println(ts1);
	}
}
