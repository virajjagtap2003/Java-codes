// Identity Hash map (In hash map when duplicate key occurs the value of same key was replaced by latest value ) here it accept duplicate key also
import java.util.*;
class IdentityHashDemo{
	public static void main(String[] args){

                IdentityHashMap Im=new IdentityHashMap();
                Im.put("Kanha","Infosys");
                Im.put("Ashish","Barclays");
                Im.put("Kanha","Apple");
                Im.put("Rahul","BMC");

		System.out.println(Im);
	}
}
