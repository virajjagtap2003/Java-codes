import java.util.*;
class Employee{
	
	int id=0;
	String name=null;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString(){
		return id+" : "+ name;
	}
		
}

class Demo{
	public static void main(String[]args){
		ArrayList al =new ArrayList();
		al.add(new Employee(20,"Viraj"));
		al.add(new Employee(40,"Jay"));
		al.add(new Employee(10,"Ram"));
		al.add(new Employee(30,"Shiv"));
		System.out.println(al);
		// sort by name
		Collections.sort(al,(obj1,obj2)->{
			return ((Employee)obj1).name.compareTo(((Employee)obj2).name);

		});

		System.out.println(al);
		
		// Sort by id
		Collections.sort(al,(obj1,obj2)->{
			return((int) (((Employee)obj1).id)-(((Employee)obj2).id));
		});
		
		System.out.println(al);
	}
}
