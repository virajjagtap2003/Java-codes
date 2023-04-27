/* A  b  C  d
   E  f  G  h
   I  j  K  l
   M  n  O  p  */

class Pattern38{
	public static void main(String args[]){
		char ch='A';
		char ch1='b';
		int n=4;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=4;j++){
				if(j%2==1){
					System.out.print(ch+"  ");
					ch+=2;
				}
				else{
					System.out.print(ch1+"  ");
					ch1+=2;
				}
			}
			System.out.println();
		}
	}
} 
