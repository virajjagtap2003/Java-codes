class ArrayDemo{
	public static void main(String args[]){
		int arr[]=new int[]{10,20,30,40,50};

		/*for(int i=0;i<arr.length;i++){

			System.out.println(arr[i]);
	       }*/

		for(int x:arr){
			System.out.println(arr[0]);  //10
			System.out.println(x);
		}
		for(float y:arr){
			System.out.println(y);
		}
	}
}
