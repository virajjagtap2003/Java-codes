// Array Reverse

class Rev{
	public static void main(String[] args){
		int arr[]={10,20,30,40,50};
		int len=arr.length;
		int rev[]=new int[len];
		int index=0;
		int i=arr.length-1;
		while(i>=0){
			rev[index]=arr[i];
			index++;
			i--;
			
		}
		
		for(int j=0;j<rev.length;j++){
			System.out.print(rev[j]+"  ");
		}	
	}
}
