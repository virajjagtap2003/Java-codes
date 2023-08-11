class Demo{
	public static void main(String[] args){
		int no=23;
		int temp=no;
		int count=0;
		while(no!=0){
			int rem=no%10;
			sum=rem*rem;
			no=no/10;
		}
		while(sum!=0){
			count++;
			sum=sum/10;
		}
		

	}
}
