// write a program print odd numbers from 1 to 50

class Odd{
	public static void main(String args[]){
		int n=50;
		for(int i=1;i<=n;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
	}
}
