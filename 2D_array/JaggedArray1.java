class Jagged{
	public static void main(String []args){
		int arr[][]={{10,20,30},{40,50},{60}}; // First menthod

		int arr1[][]=new int[4][];  // second method
		arr1[0]=new int[]{1,2,3};
		arr1[1]=new int[]{4,5};
		arr1[2]=new int[]{6};

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
