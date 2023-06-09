// IMP

class IPL{
	void match(String team1,String team2){
		System.out.println(team1+" VS "+team2);
	}

	void match(String team1,String team2,String Venue){
		System.out.println(team1+" VS "+team2);
		System.out.println(Venue);
	}
}
class Client{
	public static void main(String[] args){
		IPL obj=new IPL();
		obj.match("GT","CSK");
		obj.match("GT","CSK","NMS");
	}
}
