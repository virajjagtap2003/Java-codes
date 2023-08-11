class Solution 
{
    //Function to reverse words in a given string.
   
        // code here 
	static String RString(){
		
	
	   int itr=0;
	String S="viraj.jagtap";
        String arr[]=S.split("\\.");
	String arr1[]=new String[arr.length];
        for(int i=arr.length-1;i>=1;i--){
		arr1[itr]=arr[i]+".";
		itr++;		
        }
	arr1[arr.length-1]=arr[0];

        return new String(arr1);
	}
	
    
}
class Demo{
	public static void main(String[] args){
		
	Solution.RString();
	}
}
