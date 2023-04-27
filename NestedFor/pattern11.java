/* A  1  B  2
 * A  1  B  2
 * A  1  B  2*/

class Pattern11{
	public static void main(String args[]){
	

		for(int i=1;i<=3;i++){
			char ch='A';
			int no=1;
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
