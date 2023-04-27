import java.util.*;
class Prime{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter array size");
		int size=sc.nextInt();
		int count=0;
		int countprime=0;
		int arr[]=new int[size];

		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			for(int j=1;j<=arr[i];j++){
		
				if(arr[i]%j==0){
					count++;
				}
			}				
		if(count==2){
			countprime++;
			}
			count=0;
		
		}
		System.out.println("count of prime elements="+countprime);
	}
}
