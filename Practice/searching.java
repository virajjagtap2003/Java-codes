//Searching an Element in Array | Linear Search
import java.util.*;

class Searching{
	public static void main(String [] args){
		int arr[]={1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element to search");
		int no=sc.nextInt();
		int flag=0;
		for(int i=0;i<arr.length;i++){
			
			if(no==arr[i]){
				System.out.println("element found at index ="+i);
				flag=1;
			}
		}
		if(flag==0){
			System.out.println("Element not found");
		}
		
	}
}
