// 1 to n number check prime or noo
class Prime{
	public static void main(String[] args){
		
		int no=1;
		int no1=10000;
		while(no<=no1){
			int count=0;
			for(int i=1;i<=no;i++){
				if(no%i==0){
					count++;
				}
			}
			if(count==2){
				System.out.println(no);
			}
			no++;
		}

	}
}
