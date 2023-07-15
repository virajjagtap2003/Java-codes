// missing number in array

class Missing {
    public static void main(String[] args) {
        int arr[] = {10,9,8,6,7,3,5,4,1};
        int sum=0;
	int sum1=0;
	int missing=0;
        for (int i = 0; i < arr.length; i++) {
		sum=sum+arr[i];
    	}
 
	for(int i=1;i<=10;i++){
		sum1=sum1+i;
	}
	missing=sum1-sum;
	System.out.println("Missing number="+missing);
}
}
