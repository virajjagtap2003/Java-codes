// Enter your fav.cricket player and display its top runrate using scanner class

import java.util.*;
class FavPlayer{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your fav cricket player name");
		String name=sc.next();

		System.out.println("Enter runrate");
		int run=sc.nextInt();

		System.out.println(name);
		System.out.println(run);
	}
}
