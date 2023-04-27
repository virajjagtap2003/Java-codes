// take three numbers and check they are pythagorean triplet or not


class Pythagoren{
	public static void main(String args[]){
		int x=3;
		int y=4;
		int z=5;

		if(x*x + y*y == z*z)
			System.out.println("pythagoren triplet");
		else if(x*x + z*z== y*y)
			System.out.println("Pythagoren triplet");
		else if(y*y + z*z== x*x)
			System.out.println("pythagoren triplet");
		else 
			System.out.println("Not pythagoren triplet");
	}
}
