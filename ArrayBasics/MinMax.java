import java.util.*;
class Check{
	public static void main(String[] args){
		int arr[]={3,2,1,56,1000,167};
		int min=arr[0];
		int max=arr[0];

		for(int i=1;i<arr.length;i++){
			if(min>arr[i]){
			
				min=arr[i];
			}if(max<arr[i]){
				max=arr[i];
			}

		}
	
		System.out.println(min);
		System.out.println(max);

	}
}
