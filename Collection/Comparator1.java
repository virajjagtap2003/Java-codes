// sort arraylist for userDefinied example use= comparator (Arraylist have not compare method )
import java.util.*;
class Employee{
	String name=null;
	float sal=0.0f;
	
	Employee(String name,float sal){
		this.name=name;
		this.sal=sal;
	}	
	public String toString(){
		return name+" : "+sal;
	}
}
class SortByName implements Comparator <Employee>{      
	public int compare(Employee obj1,Employee obj2){  // comparator contains compare method 
		return obj1.name.compareTo(obj2.name);
	}
}

class SortBySal implements Comparator <Employee>{      
	public int compare(Employee obj1,Employee obj2){  // comparator contains compare method 
		return (int)(obj1.sal - obj2.sal);

	}
}
class ListSortDemo{
	public static void main(String[] args){
		ArrayList <Employee> al=new ArrayList <Employee>();  // Generic way
		al.add(new Employee("kanha",1.0f));
		al.add(new Employee("Ashish",2.0f));
		al.add(new Employee("Badhe",3.0f));
		al.add(new Employee("Rahul",4.0f));

		System.out.println(al);

		Collections.sort(al,new SortByName());
		System.out.println(al);

		Collections.sort(al,new SortBySal());
		System.out.println(al);

	}
}
