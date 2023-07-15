/*import java.util.*;
class Sorting{
	public static void main(String[] args){
		int arr[]={2,1,3,4};
		Arrays.sort(arr);

	
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	
	}
}
}*/

class Bubble{
	public static void main(String[] args){
		int arr[]={10,2,3,6,4,9,5,1,7,8};
		int temp=0;
			for(int i=0;i<arr.length-1;i++){	

				for(int j=0;j<arr.length-1;j++){
					if(arr[j]>arr[j+1]){
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
