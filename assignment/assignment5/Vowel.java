// Write a program to count number of vowels in a string

class VowelDemo{
		public static void main(String[]args){
	String str="Core2Web";

	int count=0;

	char arr[]=str.toCharArray();
	for(int i=0;i<arr.length;i++){
		if(arr[i]=='a' || arr[i]=='A'  ||
		    arr[i]=='e' ||arr[i]== 'E' ||
		    arr[i]== 'i' ||arr[i]== 'I' ||
		    arr[i]== 'o' ||arr[i] =='O' ||
		    arr[i]==   'u' ||arr[i]== 'U'){

			   	count++;
			   }
	}
	System.out.println("Vowel count="+count);
	
}
}
