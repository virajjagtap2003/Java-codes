class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
public static void main(String[] args){
    
        // add your code here
	int arr[]={1,2,3,4,5};
	int d=2;
        int itr=0;
        int arr1[]=new int [arr.length];
        for(int i=d;i<arr.length;i++){
            arr1[itr]=arr[i];
            itr++;
        }
        for(int j=0;j<d;j++){
            arr1[itr]=arr[j];
            itr++;
            
           /* if(i>d){
                break;*/
            
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        
    
	}
}
   
