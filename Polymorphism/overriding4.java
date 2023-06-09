class Match{
	void matchtype(){
		System.out.println("T20/ oneday/ test");
	
	}
}
class IPLMatch extends Match{
	
	void matchtype(){
		System.out.println("T20");
	
	}
}
class TestMatch extends Match{
	
	void matchtype(){
		System.out.println("Test");
	
	}
}
class Client{
	public static void main(String[] args){
		Match obj1=new IPLMatch();
		obj1.matchtype();
		Match obj2=new TestMatch();
		obj2.matchtype();
	}
}
