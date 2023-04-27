/*  A  1  B  2
 *  C  3  D
 *  E  4
 *  F     */

class Pattern36{
	public static void main(String args[]){
		int n=4;
		int n1=1;
		char ch='A';
		for(int i=1;i<=n;i++){
			for(int j=4;j>=i;j--){
				if(j%2==0){
					System.out.print(ch+"  ");
					ch++;
				}
				else{
					System.out.print(n1+"  ");
					n1++;
				}
			}
			System.out.println();
		}
	}
}
