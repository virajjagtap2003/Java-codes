// Duplicate elements in array
class Duplicate{
	public static void main(String[] args){
		int arr[]={2,1,4,5,4,7,7};
		int arr1[]=new int[10];
		int index=0;
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					arr1[index]=arr[j];
					count++;
					index++;
				}
			}
		}

		for(int i=0;i<count;i++){
			System.out.println(arr1[i]+"  ");
		}
	}
}
