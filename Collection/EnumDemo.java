import java.util.*;
class EnumerationDemo{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		Enumeration cursor=al.Element();
		System.out.println(cursor.getClass().getName());  // java.util.vector$1 (annonymous inner class)

		while(cursor.hasMoreElements()){
			System.out.println(cursor.nextElement());
		}
	}
}
