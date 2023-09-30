class Solution {
   static public int lastIndex( String s) {
        int index=0;;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==1){
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args){
    	int ans=lastIndex("00001");
	System.out.println(ans);
    }
}

