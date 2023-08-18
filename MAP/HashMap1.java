// HashSet internally hashmap .. (follow this Example )
// preserve soder depends on hashcode  complete solution in notebook
// Hash map contains key : value
import java.util.*;
class HashMapDemo{
	public static void main(String[] args){
		HashSet hs=new HashSet();
		hs.add("Kanha");
		hs.add("Ashish");
		hs.add("Badhe");
		hs.add("Rahul");

		System.out.println(hs); // (Depends on hashcode )[Rahul, Ashish, Badhe, Kanha]
		System.out.println(hs.hashCode()); // hashcode = s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]

		HashMap hm=new HashMap();
		hm.put("Kanha","Infosys");
		hm.put("Ashish","Barclays");
		hm.put("Badhe","Carpro");
		hm.put("Rahul","BMC");

		System.out.println(hm);  // sequence is same as hashset bcz hashset is internally hashmap 
		
		// Duplicate key not allowed if occured its **key** was changed by latest **value**

		HashMap hm1=new HashMap();
		hm1.put("Kanha","Infosys");
		hm1.put("Ashish","Barclays");
		hm1.put("Kanha","Apple");
		hm1.put("Rahul","BMC");

		System.out.println(hm1);   // here kanha=Infosys was replaced by Apple
	}
}


