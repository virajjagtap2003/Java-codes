import java.util.*;
class StackDemo{
	public static void main(String[] args){
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);

		System.out.println(s);
		/*while(s.size()!=0){
			s.pop();
			System.out.println(s);
		}*/

		System.out.println(s.peek()); // only return value from top(40)
		System.out.println(s.search(30));

	}
}
