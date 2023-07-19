class Solution {
    int missingNumber(int arr[], int n) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<arr.length;i++){
    
                sum=sum+arr[i];
            }
            
        for(int i=1;i<=n;i++){
                
            sum1=sum+i;
        }
	int miss=sum1-sum;
            
        return miss;
    }
    public static void main(String[] args){
            int arr[]={1,2,3,5};
            int n=5;
	int miss=0;
	    System.out.println(miss);
        
    }
}
