// count elements having atleast 1 element is greater than itself

class Count{
	/*static int CountElement(int arr[]){
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					count++;
					break;
				}
			}
		}
		return count;
	}
	public static void main(String[] args){
		int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};
		int ans=CountElement(arr);
		System.out.println(ans);
	}*/
	
	// Optimised way
	// count max element count and subtract from array length
	public static void main(String[] args){
	 int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};
	int max=Integer.MIN_VALUE;// insted of max=arr[0]
	// finding max
	for(int i=0;i<arr.length;i++){
		if(max<arr[i]){
			max=arr[i];
		}
	}
	// check count of maximum elements
	int count=0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]==max){
			count++;
		}
	}
	System.out.println(arr.length-count);
	}
}
