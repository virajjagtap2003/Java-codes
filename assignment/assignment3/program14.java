// write a program print countdown of days to submit  the assignment

class Assignment{
	public static void main(String args[]){
		int days=7;
		int temp=days;
		for(int i=1;i<=days;i++){
			System.out.println(temp+" days remaining");
			temp--;

		}
		System.out.println(temp+" days are remaining assignment overdue");
	}
}
