// from 1 to 50 check number is divided by 3 & 5 or 4 skip that number 

class Continue{
	public static void main(String args[]){
		for(int i=1;i<=50;i++){
			if((i%3==0 && i%5==0) || (i%4==0)){
				continue;
			}
			System.out.println(i);
		}
	}
}
