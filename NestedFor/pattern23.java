/* 1  4  9
 *16  25  36
  49  64  81*/

class Pattern23{
	public static void main(String args[]){
		int no=1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print(no*no+"  ");
				no++;
			}
			System.out.println();
		}

		
	}
}

