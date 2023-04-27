/*  1  4  3  16
 *  5  36  7 
 *  8  81
 *  10   */

class Pattern37{
	public static void main(String args[]){
		int no=1;
		int n=4;
		for(int i=1;i<=n;i++){
			for(int j=4;j>=i;j--){
				if(j%2==1){
					System.out.print(no*no+"  ");
					no++;
				}
				else{
					System.out.print(no+"  ");
					no++;
				}
			}
			System.out.println();
		}
	}
}
 
