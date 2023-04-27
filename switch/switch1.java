import java.io.*;
class SwitchDemo{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no two perform maths operations");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());

		System.out.println("Enter choice1.Addition 2.Substraction  3.Multiplication  4.Division");
		int ch=Integer.parseInt(br.readLine());

		switch(ch){
		
			case 1:
				System.out.println("Addition="+(a+b));
				break;
			case 2:
				System.out.println("Substraction="+(a-b));
				break;
			case 3:
				System.out.println("Multiplication="+(a*b));
				break;
			case 4:
				System.out.println("Division="+(a/b));
				break;
			default:
				System.out.println("Invalid Choice");

		}
		
	}
}
