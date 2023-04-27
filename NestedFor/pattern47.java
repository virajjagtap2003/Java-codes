/* F
 * E  F
 * D  E  F
 * C  D  E  F
 * B  C  D  E  F
 * A  B  C  D  E  F   */

class Pattern47{
	public static void main(String args[]){
		char ch='F';
		char ch1;
		ch1=ch;
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
				System.out.print(ch1+"  ");
				ch1++;
			}
			System.out.println();
			ch--;
			ch1=ch;
		}
	}
}
