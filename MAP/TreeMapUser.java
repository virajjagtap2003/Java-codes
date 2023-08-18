// userDefined treemap/treeSet asel trr compareto lihavi lagte otherwise class cast exception occured .preDefined la auto call jato.
import java.util.*;
import java.lang.*;
class PreDefined implements Comparable{
	String Name=null;
	int Year=0;

	PreDefined(String Name,int Year){
		this.Name=Name;
		this.Year=Year;
	}
	public String toString(){
		return Name+" : "+Year;
	}

	public int compareTo(Object obj){   // comparing year
		return this.Year -((PreDefined)obj).Year;
	}

}
class TreeMapDemo{
	public static void main(String[] args){
		TreeMap tm=new TreeMap();
		tm.put(new PreDefined("Youtube",2005),"Google");
		tm.put(new PreDefined("Instagram",2010),"Meta");
		tm.put(new PreDefined("FaceBook",2004),"Meta");
		tm.put(new PreDefined("ChatGpt",2022),"OpenAi");

		System.out.println(tm);
	}
}
