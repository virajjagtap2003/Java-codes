// from 1 to 40 when number divided by 3 and 5 then break otherwise print numbers

class Break{
	public static void main(String args[]){
		int n=40;
		for(int i=1;i<=n;i++){
			if(i%3==0 && i%5==0){
				break;

			}
			System.out.println(i);
		}
	}
}
