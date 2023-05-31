class Icc{
	Icc(){
		System.out.println("In Icc Constructor");
	}
	
}
class Bcci extends Icc{
	Bcci(){   // call to parent class
		System.out.println("In Bcci Constructor");
	}
}

class Client{
	public static void main(String[] args){
		Bcci obj=new Bcci();
	}
}
