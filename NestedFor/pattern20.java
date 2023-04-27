/* 14  15  16  17
 * 15  16  17  18
 * 16  17  18  19
 * 17  18  19  20*/

class Pattern20{
	public static void main(String args[]){
		int no=14;
		for(int i=1;i<=4;i++){
		
			for(int j=1;j<=4;j++){
				System.out.print(no+"  ");
				no++;	
			}
			no=14;
			no=no+i;
			
			System.out.println();
		}
	}
}
