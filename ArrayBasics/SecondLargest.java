// Find second largest from array

class Second{
	public static void main(String[] args){
		int arr[]=new int[]{2225,2226,2,33,88};
		int max=arr[0];
		int Secondmax=0;
		int temp=0;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				temp=max;
				max=arr[i];
				Secondmax=temp;
			}
		}
		System.out.println(Secondmax);
	}
}
