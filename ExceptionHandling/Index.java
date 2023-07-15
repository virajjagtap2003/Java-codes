// Array index out of bound(run time exception)

class Bound{
	public static void main(String[] args){
		int arr[]={10,20,30,40,50};
		for(int i=0;i<=arr.length;i++){  // exceed limit arr.lenght index element
			System.out.println(arr[i]);
		}  
	}
}
