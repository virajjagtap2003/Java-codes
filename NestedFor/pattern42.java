/*  1
 *  2  3 
 *  4  5  6
 *  7  8  9  10  */

class Pattern42{
	public static void main(String args[]){
		int n=4;
		int no=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(no+"  ");
				no++;
			}
			System.out.println();
		}
	}
}
