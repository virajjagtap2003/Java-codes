// form a largest  number from array numbers [2,1,3,4]=4321
import java.util.*;
class Demo{
	public static void main(String[] args){
		int arr[]={9,0,1,3,0};
		Arrays.sort(arr);
		StringBuilder no=new StringBuilder();
		for(int i=arr.length-1;i>=0;i--){
			no.append(arr[i]);
		}
		int ans =Integer.parseInt(no.toString());
		System.out.print(ans);
	}
}
