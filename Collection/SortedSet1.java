import java.util.*;
class SortedSetDemo{
	public static void main(String[] args){
		SortedSet ss=new TreeSet();
		ss.add("Kanha");
		ss.add("Rajesh");
		ss.add("Rahul");
		ss.add("Ashish");
		ss.add("Badhe");

		System.out.println(ss);

		System.out.println(ss.headSet("Kanha")); // before kanha
		System.out.println(ss.tailSet("Kanha")); // after kanha with kanha
		System.out.println(ss.subSet("Ashish","Rahul")); // between this two strings 
		System.out.println(ss.first());
		System.out.println(ss.last());

	}
}

