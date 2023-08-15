import java.util.*;
class NavigableSetDemo{
	public static void main(String[] args){
		NavigableSet ns=new TreeSet();

		ns.add(50);
		ns.add(20);
		ns.add(40);
		ns.add(10);
		ns.add(30);

		System.out.println(ns);

		System.out.println(ns.lower(40));  // less than 40 or (before 40 which is greater) <
		System.out.println(ns.floor(30));  // <= if not available 30 it return 20 (immdeiate small)
		System.out.println(ns.floor(22));  // <= if not available 30 it return 20
		System.out.println(ns.higher(10));  // next greater
		System.out.println(ns.ceiling(10));  // next greater (>=) or equals to if 10 not available it return 20(immediate greater)
		System.out.println(ns.ceiling(13));  // it return 20


		System.out.println(ns.pollFirst());  // it return first element but remove it 
		System.out.println(ns);

		System.out.println(ns.pollLast());  // it return last element but remove it 
		System.out.println(ns);
	}
}
