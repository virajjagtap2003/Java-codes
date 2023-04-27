// Take n as input count all its factors and print count.

class Count{
	public static void main(String args[]){
		int n=20;
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		System.out.println(count);
	}
}
