//Sort elements in ascending order 

class Ascending{
	public static void main(String[] args){
		int arr[]={10,5,6,3,7,9,2,1,4,8};
	
		int temp=0;

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){

			System.out.println(arr[i]);
		}
	}
}
