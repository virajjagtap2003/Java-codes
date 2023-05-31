// Change private variable from outside the class (Without using this) Beacause different variable

class Player{
	private int jerNo=0;
	private String playerName=null;

	Player(int jno,String pname){
		jerNo=jno;
		playerName=pname;
	}
	void info(){
		System.out.println(jerNo+"="+playerName);
	}

}
class Client{
	public static void main(String[] args){
		Player obj1=new Player(18,"Virat");
		obj1.info();

		Player obj2=new Player(7,"MSD");
		obj2.info();

		Player obj3=new Player(45,"Rohit");
		obj3.info();
		
	}
}
