// To sort arraylist use collections class (for predifined class  contains collections)
import java.util.*;
class SortDemo{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		al.add("kanha");
		al.add("viraj");
		al.add("badhe");
		al.add("ashish");
		al.add("viraj");
		// to sort arraylist we can use treeset but when duplicate data occurs it delete it so it is problem so use collections class
		TreeSet ts=new TreeSet(al);
		System.out.println(ts); // as, ba ,ka, vi

		Collections.sort(al);
		System.out.println(al); // as, ba, ka, vi, vi
	}
}
