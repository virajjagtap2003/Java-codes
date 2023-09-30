// Replace all 0's with 5

class ReplaceDemo{
	public static void main(String[] args){
		int var=1004;
		int temp=var;
		int count=0;
		while(var!=0){
			count++;
			var=var/10;
		}
		int arr[]=new int[count];
		while(temp!=0){
			temp=temp%10;
			int i=0;
			arr[i]=temp;
			temp=temp/10;
			i++;
		}
		for(int digit:arr){
			System.out.println(digit);
		}

			
	

	}
}
