import java.util.*;
class HashDemo{
	public static void main(String[] args){
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(10);  // does not stored duplicate values

		System.out.println(hs); // storing order is not fix

		hs.add(new Integer(40));// it also stored only once
	}
}
