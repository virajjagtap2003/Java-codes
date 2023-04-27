/* 9
 * 9  8
 * 9  8  7
 * 9  8  7  6   */

class Pattern46{
	public static void main(String args[]){
		for(int i=1;i<=4;i++){
			int no=9;
			for(int j=1;j<=i;j++){
				System.out.print(no+"  ");
				no--;
			}
			System.out.println();
		}
	}
}
