class Second{
	public static void main(String[] args){
		int arr[]={1,20,30,4,10,4};
		int min=arr[0];
		int min1=0;
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=min;
					min=arr[j];
					min1=temp;
				}
			}
		}
		System.out.println("Second minimum="+min1);
	}
}


