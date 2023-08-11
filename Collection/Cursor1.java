import java.util.*;
class IteratorDemo{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		al.add("viraj");
		al.add("Abhi");
		al.add("aadi");

		Iterator itr=al.iterator();
		/*while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		while(itr.hasNext()){
			String current=(String)itr.next();	
			if("Abhi".equals(current)){
				itr.remove();
			}
			System.out.println(current);
		}
		System.out.println(al);	
	}
}
