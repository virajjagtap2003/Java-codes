//  Write a program to find the non repeating characters in the string

class NonRepeatingDemo{
        public static void main(String[] args){
                String str="core2web";
                char arr[]=str.toCharArray();
		int count=0;
                for(int i=0;i<arr.length;i++){
			count=0;
                        for(int j=0;j<arr.length;j++){
                                if(arr[i]==arr[j]){
                                        count++;
                                }
                        }
			if(count==1){
				System.out.println(arr[i]);
			}
                }
        }
}
