// LAst instance of character

class LastIndexOfDemo{
	public static void main(String args[]){
		String str="Shashi";

		System.out.println(str.lastIndexOf('h',5));  // In between 0-5 last occurance of h 4
		System.out.println(str.lastIndexOf('h',1));  // In between 0-5 last occurance of h 1
		System.out.println(str.lastIndexOf('s',4));  // In between 0-5 last occurance of h 3
		System.out.println(str.lastIndexOf('S',6));  // In between 0-5 last occurance of h 0
	}
}
