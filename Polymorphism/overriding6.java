class Parent{
	Object fun(){                   // object class
		return new Object();
		return new Object();
	}
}
class Child extends Parent
	String fun(){                     // string class
		return "Viraj";
		return new String();	
	}

}
class Client{
	public static void main(String[] args){
		Child obj=new Child();
		obj.fun();
	}
}
