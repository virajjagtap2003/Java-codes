// change private variable using this(Same name of variable)

class Player{
	private int jerno=0;
	private String name=null;

	Player(int jerno,String name){
		this.jerno=jerno;
		this.name=name;
	}
	void info(){
		System.out.println(jerno+" = "+name);
	}
}
class Client{
	public static void main(String [] args){
		Player obj1=new Player(18,"Virat");
		obj1.info();
	
		Player obj2=new Player(45,"Rohit");
		obj2.info();

		Player obj3=new Player(7,"MSD");
		obj3.info();
}
}
