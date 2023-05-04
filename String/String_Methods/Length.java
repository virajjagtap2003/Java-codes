class LengthDemo{
	public static void main(String []args){
		String str="viraj";
		System.out.println(str.length());

		// Length without using length method
		int i=0;
		for(char c:str.toCharArray()){
			i++;
		}
		System.out.println("Length="+i);
		
	}
}
