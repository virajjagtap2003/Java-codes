// Preserve order is matter here..

import java.util.*;
class LinkedHashMapDemo{
	public static void main(String[] args){
		LinkedHashMap lm=new LinkedHashMap();
		lm.put("Name","Viraj");
		lm.put("Surname","Jagatp");
		lm.put("Dept","IT");
		lm.put("Year","BE");

		System.out.println(lm);
	}
}
