class Reverse{
	static int []Rev(int arr[]){
		int start=0;
		int end=arr.length-1;
		while(start<end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;
	}
	public static void main(String[] args){
		
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
		int ans[]=Rev(arr);
		for(int no:ans){
			System.out.println(no);
		}
	}
}
