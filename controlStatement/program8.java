// Electricity bill in home
// calculate and print the bill unit
// unit <=100  price is 1 per unit
// unit >100 price is 2 per unit


class Bill{
	public static void main(String[] args){
		int unit=400;
		if(unit<=100)
			System.out.println(unit*1);
		else
			System.out.println(100*1+(unit-100)*2);
	}
}
