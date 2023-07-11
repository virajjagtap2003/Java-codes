//1. no name of class
//2. only one object can create when try to create new object Direct new class was create
//3. used in one time use class
//4. parent child realtion used for overiding

class Demo{
	void marry(){
		System.out.println("Dipika");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo(){  // compiler convert to Demo obj=new Client$1 (parent child realtion)
			void marry(){
				System.out.println("Aaliya");
			}
			
		};

		Demo obj1=new Demo(){
			void marry(){
				System.out.println("Kriti");
			}
		};

	}
}
