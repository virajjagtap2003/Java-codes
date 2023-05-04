class LengthDemo{

	static int mystrlen (String str){
		char arr[]=str.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++){
			count++;
		}
		return count;
	}
	public static void main(String []args){
		/*String str="viraj";
		System.out.println(str.length());*/

		// Length without using length method
		
		String str="Viraj";
		int len=mystrlen(str);
		System.out.println(len);
	}
}
