// Enter your dreamcompany name and expected package using scanner class


import java.util.*;
class DreamCompany{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your dream company name");
		String name=sc.next();

		System.out.println("Enter your expected package");
		float Package = sc.nextFloat();

		System.out.println(name);
		System.out.println(Package);
	}
}
