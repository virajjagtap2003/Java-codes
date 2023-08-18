// for multiple objects compare krayche astil trr = comparator use
import java.util.*;
import java.lang.*;
class PreDefined1{
        String Name=null;
        int Year=0;

        PreDefined1(String Name,int Year){
                this.Name=Name;
                this.Year=Year;
        }
        public String toString(){
                return Name+" : "+Year;
        }
}
class SortByName implements Comparator{
	public int compare(Object obj1,Object obj2){
		return ((PreDefined1)obj1).Name.compareTo(((PreDefined1)obj2).Name);
	}
}
class SortByYear implements Comparator{
	public int compare(Object obj1,Object obj2){
		return (int)(((PreDefined1)obj1).Year)-(((PreDefined1)obj2).Year);
	}
}
class TreeMapDemo2{
        public static void main(String[] args){
                TreeMap tm=new TreeMap(new SortByName());
                tm.put(new PreDefined1("Youtube",2005),"Google");
                tm.put(new PreDefined1("Instagram",2010),"Meta");
                tm.put(new PreDefined1("FaceBook",2004),"Meta");
                tm.put(new PreDefined1("ChatGpt",2022),"OpenAi");

                System.out.println(tm);

	//	Collections.sort(tm,new SortByName());  not allowed in treemap  use direct parameter to Treemap tm =new TreeMap();
		
                TreeMap tm1=new TreeMap(new SortByYear());
                tm1.put(new PreDefined1("Youtube",2005),"Google");
                tm1.put(new PreDefined1("Instagram",2010),"Meta");
                tm1.put(new PreDefined1("FaceBook",2004),"Meta");
                tm1.put(new PreDefined1("ChatGpt",2022),"OpenAi");
		System.out.println(tm1);
		
        }
}
