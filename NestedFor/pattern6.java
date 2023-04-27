/* 4  5  6  7
 * 4  5  6  7
 * 4  5  6  7*/

class Pattern6{
	public static void main(String args[]){
		
		for(int i=1;i<=3;i++){
			int no=4;
			for(int j=1;j<=4;j++){
				System.out.print(no+"  ");
				no++;
			}
			System.out.println();
		}
	}
}
