// calculate profit or loss. write a program that takes selling and cost price and calculate its profit or loss.
// selling price =1200  cost price ==1000 ==profit of 200
class Profit{
	public static void main(String args[]){

		int sp=10;
		int cp=1200;

		if(sp==cp)
			System.out.println("No Profit no loss");
		else if(sp>cp)
			System.out.println("profit of"+ (sp - cp));

		else 
			System.out.println("loss of"+ (cp - sp));

		
	}
}
