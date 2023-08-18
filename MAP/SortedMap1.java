import java.util.*;
class SortedMapDemo{
	public static void main(String[] args){
		SortedMap sm=new TreeMap();  // TreeMap Sort krto
		sm.put("Ind","India");
		sm.put("Pak","Pakistan");
		sm.put("Sl","Srilanka");
		sm.put("Aus","Australia");
		sm.put("Ban","Bangladesh");

		System.out.println(sm); //{Aus=Australia, Ban=Bangladesh, Ind=India, Pak=Pakistan, Sl=Srilanka}

		// submap
		System.out.println(sm.subMap("Aus","Pak")); // {Aus=Australia, Ban=Bangladesh, Ind=India}

		// headMap

		System.out.println(sm.headMap("Pak")); //{Aus=Australia, Ban=Bangladesh, Ind=India}
		
		// tailMap

		System.out.println(sm.tailMap("Pak")); // {Pak=Pakistan, Sl=Srilanka}
		
		// firstKey
		System.out.println(sm.firstKey());
		// last key
		System.out.println(sm.lastKey());
		
		//keySet
		
		System.out.println(sm.keySet());
		// values

		System.out.println(sm.values());
		// entrySet

		System.out.println(sm.entrySet());
		


	}
}
