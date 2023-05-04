// from entered index where the char firstly occur

class IndexOfDemo{
	public static void main(String args[]){
		String str="Viraajjagtap";
		System.out.println(str.indexOf('r',0));  //2
		System.out.println(str.indexOf('a',0));   //3
		System.out.println(str.indexOf('j',0));   //5

		System.out.println(str.indexOf('r',2));   //2
		System.out.println(str.indexOf('j',3));   //5
}
}

