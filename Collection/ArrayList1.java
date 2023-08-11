import java.util.*;

class Demo{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10.4);
		al.add(10.4f);
		al.add('V');
		al.add("JAVA");

		System.out.println(al);

		// size()
		System.out.println(al.size());
		// Get using for loop
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		// print using for Each loop

		for(Object obj:al){           // Here suppose we written int obj:al so another dataType is not allowed(incompactible) so trying object class
			System.out.println(obj);

		}
		// By trying var character (in var all types of datatype are allowed (before java 10) )
	/*	for(var obj:al){
			
			System.out.println(obj);
		}*/
		 

		// contains
		boolean var1=al.contains(10);
		System.out.println(var1);// true
		boolean var2=al.contains(220);
		System.out.println(var2);// false

		// index of
		int var3=al.indexOf(10.4);
		System.out.println(var3);

		// Last index of
		int var4=al.lastIndexOf(10);

		System.out.println(var4);

		// Set 

	}
}
