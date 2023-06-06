class Para{
	Para(){
		System.out.println("In Para Constructor");
	}
	Para(int x){
		System.out.println("In parameter");
	}
	Para(Para xyz){
		System.out.println("Parameter Demo");
	}

	public static void main(String[] args){
		Para obj1=new Para();
		Para obj2=new Para(10);
		Para obj3=new Para(obj2);

		
	}
}
