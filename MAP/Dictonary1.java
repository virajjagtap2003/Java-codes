// Iterator on dictionary
import java.util.*;
class DictionaryDemo{
	public static void main(String[] args){
		Dictionary dt=new Hashtable();   
               	 dt.put(10,"Sachin");
               	 dt.put(7,"Dhoni");
               	 dt.put(18,"Virat");
               	 dt.put(1,"Rahul");
               	 dt.put(45,"Rohit");

		 System.out.println(dt);

		 // applying iterator on dictionary (iterator is part of collection but enumeration is part of dictionary so use enumration)
		 Enumeration itr1=dt.keys();
		 while(itr1.hasMoreElements()){
		 	System.out.println(itr1.nextElement());
		 }

		 Enumeration itr2=dt.elements();
		 while(itr2.hasMoreElements()){
		 	System.out.println(itr2.nextElement());
		 }

	}
}
