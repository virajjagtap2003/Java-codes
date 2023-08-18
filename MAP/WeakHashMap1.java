// Garbage collector (Notify and then delete address )
// working of garbage collector

class Demo{
	String str;
	Demo(String str){
		this.str=str;
	}
	public String toString(){
		return str;
	}
	public void finalize(){
		System.out.println("Notify");
	}

}
class WHashDemo{
	public static void main(String[] args){
		
		Demo obj1=new Demo("Core");
		Demo obj2=new Demo("Java");
		Demo obj3=new Demo("Development");

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);

		obj1=null;
		System.gc();  // Direct call to notify 

		
	


	}
}
