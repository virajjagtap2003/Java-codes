// Product of maximum of first array and minimum from second array

class ProductDemo{
	public static void main(String[] args){
		int arr1[]={5,7,9,3,6,2};
		int arr2[]={1,2,6,-1,0,9};

		int max=arr1[0];
		int min=arr2[0];
		for(int i=1;i<arr1.length;i++){
			if(max<arr1[i]){
				max=arr1[i];
			}
		}
		for(int i=1;i<arr2.length;i++){
			if(min>arr2[i]){
				min=arr2[i];
			}
		}
		System.out.println(max*min);
	}
}
