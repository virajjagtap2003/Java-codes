//2  4  6  8  10
//1  3  5  7  9
//2  4  6  8  10
//1  3  5  7  9


class Demo{
	public static void main(String [] args){
		int no=2;
		int no1=1;

		for(int i=1;i<=4;i++){
			for(int j=1;j<=5;j++){
				if(i%2!=0){
					System.out.print(no+"  ");
					no=no+2;
				}else{
					System.out.print(no1+"  ");
					no1=no1+2;
				}
			}
			System.out.println();
			no=2;
			no1=1;
		}
	}
}
