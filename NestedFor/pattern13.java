/* A  1  B  2
 * C  3  D  4
 * E  5  F  6*/

class Pattern13{
	public static void main(String args[]){
		char ch='A';
		int no=1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=4;j++){
				if(j%2!=0){
					System.out.print(ch+" ");
					ch++;
				}
				else{
					System.out.print(no+" ");
					no++;
				}
			}
			System.out.println();
		}
	}
}
