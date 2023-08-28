// for given entered string replace every letter by its next adjecent letter,all special character remains same and capitalize vowels from new string. 

class Demo{
	public static void main(String[] args){
		String str="viraj@$123";
		char arr[]=str.toCharArray();
		char ch='\0'; 
		for(int i=0;i<arr.length;i++){
			if(arr[i]>='a' && arr[i]<='z' || arr[i]>='A' && arr[i]<='Z'){
				if(arr[i]=='z'){
					arr[i]='a';
				}else{
					ch=arr[i];
					ch++;
					arr[i]=ch;
					ch='\0';
				}
			}
		}
		
		for(int i=0;i<arr.length;i++){
		
			System.out.print(arr[i]+ "  ");
		}
		System.out.println();
	
		char ch1='\0';
		char n='\0';
		for(int i=0;i<arr.length;i++){
			if(arr[i]== 'a' ||
			   arr[i]== 'e' || 
			   arr[i]== 'i' ||
			   arr[i]== 'o' ||
			   arr[i]== 'u' ){
			   	
				arr[i]=(char)(arr[i]-32);
					
			   }else{
			   	
				arr[i]=arr[i];
			   }

		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
	}	
}

//  w  j  s  b  k  @  $  1  2  3
// w  j  s  b  k  @  $  1  2  3
