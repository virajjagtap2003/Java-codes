// Sum of range elements
import java.util.*;
class Sum{

	static int RangeAddition(int arr[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start index");
		int s=sc.nextInt();
		System.out.println("Enter end index");
		int e=sc.nextInt();
		int sum=0;
		if(s>=0 && e<=arr.length-1){
			for(int i=s;i<=e;i++){
				sum=sum+arr[i];
			}
		}else
			System.out.println("Range not valid");
		return sum;
	}
	public static void main(String[] args){
		int arr[]=new int[]{2,5,3,11,7,9,4};
		int ans=RangeAddition(arr);
		System.out.println(ans);
	}
}
