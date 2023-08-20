// Iterator on map // need to convert into set by entryset
import java.util.*;
class IteratorDemo{
	public static void main(String[] args){
		TreeMap tm=new TreeMap();
		tm.put("Ind","India");
		tm.put("Pak","Pakistan");
		tm.put("Sl","Srilanka");
		tm.put("Aus","Australia");
		tm.put("Ban","Bangladesh");

		System.out.println(tm);
		Set<Map.Entry>data=tm.entrySet(); // converting into set

		Iterator <Map.Entry>itr=data.iterator(); // applying iterator on data
		
		// for printing whole map 
		/*while(itr.hasNext()){
			System.out.println(itr.next());
		}*/

		// for print a particular entry
		Map.Entry val=itr.next();
		System.out.println(val.getKey()+" : "+ val.getValue());




	}
}
