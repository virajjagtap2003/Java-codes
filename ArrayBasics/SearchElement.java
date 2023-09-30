// search 3 and return its index
import java.util.*;
class Demo{
	public static void main(String[] args){
		int arr[]={3,1,3,5,6};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to search");
		int no=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==no){
				System.out.println(i);		
			}		
		}
		
	}
}
