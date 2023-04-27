/* 10  10  10  10
 * 11  11  11
 * 12  12
 * 13         */

class Pattern45{
	public static void main(String args[]){
		int no=10;
		for(int i=1;i<=4;i++){
			for(int j=4;j>=i;j--){
				System.out.print(no+"  ");
			}
			no++;
			System.out.println();
		}
	}
}
