// Product iof all elements from array
class Product{
	public static void main(String [] args){
		int arr[]={1,2,3,4}; // 24
		int mul=1;

		for(int i=0;i<arr.length;i++){
			mul=mul*arr[i];
		}
		System.out.println(mul);

	}
}
