/*  1C3   4B2   9A1
 *  16C3  25B2  36A1
 *  49C3  64B2  81A1 */

class Pattern39{
	public static void main(String args[]){
		int no=1;

		for(int i=1;i<=3;i++){
			char ch='C';
			int n=3;
			for(int j=1;j<=3;j++){
				System.out.print((no*no)+""+ch+""+(n)+"  ");
				no++;
				ch--;
				n--;
			}
			System.out.println();
		}
	}
}
