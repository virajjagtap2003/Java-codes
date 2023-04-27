/* A  B  C  D
 * A  B  C
 * A  B
 * A          */

class Pattern32{
	public static void main(String args[]){
		int n=4;
		
		for(int i=1;i<=n;i++){
			char ch='A';
			for(int j=4;j>=i;j--){
				System.out.print(ch+"  ");
				ch++;
			}
			System.out.println();
		}
	}
}
