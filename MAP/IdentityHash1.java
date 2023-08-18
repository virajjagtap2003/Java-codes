import java.util.*;
class IdentityHashDemo{
	public static void main(String [] args){
		IdentityHashMap im=new IdentityHashMap();
		im.put(10,"Kanha");
		im.put(10,"Badhe");
		im.put(10,"Rahul");
		System.out.println(im);  // here it return 10,rahul bcz in one object all values are stored (one integer cashe number=10)
		// when we written new it will make new object all time.

		im.put(new IdentityHashMap(10),"Kanha");
                im.put(new IdentityHashMap(10),"Badhe");
                im.put(new IdentityHashMap(10),"Rahul");
                System.out.println(im);
	}
}
