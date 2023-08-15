// In tree set compare values that are in one form(string==string) if another type asel trr compareto method override 
import java.util.*;
class Movies implements Comparable{  // tree set kde compareto method nahi so implements comparable.
	String name=null;
	float totcoll=0.0f;

	Movies(String name,float totcoll){
		this.name=name;
		this.totcoll=totcoll;
	}
	// class casting using object
	public int compareTo(Object obj){
		return name.compareTo(((Movies)obj).name);  // class casting(at movies) compare krtana ascii value compare hote z-v asel tr 1 otherwise 0
		//return - (name.compareTo(((Movies)obj).name));  // for descending order
	
	}
	public String toString(){
		return name+" : "+ totcoll;
	}
}
class TreeSetDemo{
	public static void main(String[] args){
		TreeSet ts=new TreeSet();
		// add kelyavr dorect call to compareto
		ts.add(new Movies("zombie",3.22f));    //error( add method have one para(b)so it call internally to compareto) but here there are two para. so we need to write compareto method
		ts.add(new Movies("ved",2.30f));
		ts.add(new Movies("heart of stone",1.20f));
		System.out.println(ts);
	}
}
