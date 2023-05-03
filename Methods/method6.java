class Demo{

	 void fun(int [] arr){
		arr[1]=30;
		arr[2]=30;
		
	}
	public static void main(String [] args){
		int arr[]={1,2,3,4,5};
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		System.out.println(System.identityHashCode(arr[3]));
		System.out.println(System.identityHashCode(arr[4]));
		
		Demo obj=new Demo();
		obj.fun(arr);
		for(int x:arr){
			System.out.println(x);
		}

		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
			


	}
}
