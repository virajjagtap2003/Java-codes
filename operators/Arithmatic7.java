class program7{
	public static void main(String[] args){
		int x=8;
		int y=5;

		int ans1= ++x + x++;    //18
		int ans2= --y + y--;    //8

		System.out.println(ans1);
		System.out.println(ans2);

		System.out.println(x);  //10
		System.out.println(y);  //7
	}
}
