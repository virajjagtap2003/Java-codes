/* 9  8  7
 * 9  8  7
 * 9  8  7*/

class Pattern15{
	public static void main(String args[]){
		for(int i=1;i<=3;i++){
			int no=9;
			for(int j=1;j<=3;j++){
				System.out.print(no+" ");
				no--;

			}
			System.out.println();
		}
	}
}
