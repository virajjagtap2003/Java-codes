/* 12  12  12
 * 11  11  11 
 * 10  10  10*/

class Pattern8{
	public static void main(String args[]){
		int no=12;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print(no+" ");
			}
			no--;
			System.out.println();
		}
	
	}
}
