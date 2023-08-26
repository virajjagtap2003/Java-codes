// works on interface (only on functional interface=contains only one method)

interface Core{
	void fun();  // by default public abstract
}
class Demo{
	public static void main(String []args){
		/*Core obj=new Core(){                              // annonymous inner class Core.class  'Demo$1.class' Demo.class
			public void fun(){
				System.out.println("Program");
			}
		};   */

		// when we write annonymous inner class 3 .class files are created so use lambda function 

		Core obj=()->{
			System.out.println("Java");
		
		
		};
		obj.fun();	
	}
}
