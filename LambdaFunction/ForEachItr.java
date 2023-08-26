import java.util.*;
class IteratorDemo{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(30);
		al.add(20);
		al.add(40);

		System.out.println(al);

	/*	for(int data:al){
			System.out.println(data);
		}*/

		al.forEach((data)->{
				System.out.println(data);
		});
	}
}
