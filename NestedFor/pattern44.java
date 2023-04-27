/* 3C  3C  3C  3C
 * 3C  3C  3C
 * 3C  3C
 * 3C           */

class Pattern44{
	public static void main(String args[]){
		for(int i=1;i<=4;i++){
			for(int j=4;j>=i;j--){
				System.out.print("3C  ");
			}
			System.out.println();
		}
	}
}
