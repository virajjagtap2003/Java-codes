// check repeted characters in string
import java.util.*;
class Demo{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		String str="geeksforgeeks";
		char arr[]=str.toCharArray();

		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j] && !al.contains(arr[i])){
					al.add(arr[j]);
					break;
				}
			}
		}
		System.out.println(al);
	}
}
