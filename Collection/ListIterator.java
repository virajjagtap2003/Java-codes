import java.util.*;
class ListdemoItr{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		al.add("Viraj");
		al.add("Abhi");
		al.add("Addi");
		ListIterator li=al.listIterator();
		System.out.println(li.getClass().getName());

		while(li.hasNext()){
			System.out.println(li.next());
		}
		while(li.Prevoius){
			system.out.println(li.Previous());
		}
	}
}
