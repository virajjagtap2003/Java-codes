// sum of range elements for multiple queries by using prefix sum for optimise
// 1. start =1  End=3
// 2. start=2  End=7
// 3. start=1  End=1
import java.util.*;
class Prefix{
	public static void main(String[] args){
		int N=10;
		int Q=3;
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		// generating prefix sum array by(arr[i]=arr[i]+arr[i-1])
		int psArr[]=new int[N];
		psArr[0]=arr[0];
		for(int i=1;i<N;i++){
			psArr[i]=psArr[i-1]+arr[i];  // [-3,3,5,9,14,16,24,15,18,19]
		}
		// finding sum for given queries
		int sum=0;
		Scanner sc=new Scanner(System.in);
		for(int j=1;j<=Q;j++){
			System.out.println("enter starting index");
			int s=sc.nextInt();

			System.out.println("enter ending index");
			int e=sc.nextInt();
			
			if(s==0){
				sum=psArr[e];
			}else{
				sum=psArr[e]-psArr[s-1];
			}
				System.out.println(sum);
		}

			
	}
}

