
// count maximum repeted character from a string
import java.util.*;
class Demo{

	public static void main(String [] args){
		String str="geeksforgeeks";
		int count=0;
		
		char arr[]=str.toCharArray();
		char ch=arr[0];
		int max=count;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
					if(max<count){
						max=count;
						ch=arr[i];
					}
				}	
			}
			count=0;
		}
		System.out.println(ch);
	}

	


	
}
