// count pairs which are arr[i]+arr[j]=k;
// note i!=j

class Count{

	static int Pairs(int arr[],int k){
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if((arr[i]+arr[j]==k) && i!=j){
					count++;
					break;
				}
			}
		}
		return count;
	}
	public static void main(String[] args){
		int arr[]=new int[]{3,5,2,1,-3,7,8,15,6,13};
		int k=10;
		int ans=Pairs(arr,k);	
		System.out.println(ans);
	}
}
