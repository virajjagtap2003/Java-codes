/* 1
 * 2  3
 * 3  4  5
 * 4  5  6  7
 */

class Pattern54{
	public static void main(String args[]){
		int no=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(no+" ");
				no++;
			}

		}
	}
}
