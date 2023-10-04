// check first and last occurence of a specific element

class Check{
	public static void main(String[] args){
		int arr[]={2,1,3,5,1,3};
		int no=1;
		int first=0;
		int last=0;
	
		for(int i=0;i<arr.length;i++){
			if(no==arr[i]){
				first=i;
				break;
			}
		}
		for(int j=first+1;j<arr.length;j++){
				if(no==arr[j]){
					last=j;
				}
		}
		
		System.out.println(first);
		System.out.println(last);
	}
}
