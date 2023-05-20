//  Write a program to find the non repeating characters in the string

class NonRepeatingDemo{
        public static void main(String[] args){
                String str="core2web";
                char arr[]=str.toCharArray();
                for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr.length;j++){
                                if(arr[i]==arr[j]){
                                        System.out.println(arr[i]);
                                }
                        }
                }
        }
}
