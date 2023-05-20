//string that contains the same characters, only the order of characters can be different.

class AnagramDemo{
	public static void main(String[] args){
		String str1="viraj";
		String str2="jraiv";
		int flag=0;

		
			char arr1[]=str1.toCharArray();
			char arr2[]=str2.toCharArray();
		if(arr1.length==arr2.length){
			for(int i=0;i<arr1.length;i++){
				for(int j=0;j<arr2.length;j++){
					if(arr1[i]==arr2[j]){
						flag=1;
		       				break;				
					}else{
						flag=0;
						
					}
				
				}
				if(flag==0){
					break;
				}
			
				 
			}
			if(flag==1){
				System.out.println("Anagram");
			}else{
				System.out.println("Not Anagram");
			}
		}
		else{
			System.out.println("Not Anagram(Size not equal)");
		}
	}
}
