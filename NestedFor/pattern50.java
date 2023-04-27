/* 1  2  3  4
 * 4  5  6
 * 6  7 
 * 7      */

class Pattern50{
	public static void main(String args[]){
		int no=1;
		for(int i=1;i<=4;i++){
			for(int j=4;j>=i;j--){
				System.out.print(no+"  ");
				no++;
			}
			no--;
			System.out.println();
		}
	}
}
