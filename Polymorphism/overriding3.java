class Parent{
        Parent(){
                System.out.println("In parent constructor");
        }
        void fun(){

                System.out.println("In parent fun");
        }
}
class Child extends Parent{
        Child(){

                System.out.println("In child constructor");
        }
        void fun(int x){

                System.out.println("In child fun");
        }
}
class Client{
        public static void main(String[] args){
                Parent obj1=new Child();
                obj1.fun();    
		//obj1.fun(10);// error require no argument found int

   		Parent obj2=new Child();
		obj2.fun(); // if parent fun require int and pass no argument so it also error 
	
		Child obj3=new Child();
		obj3.fun(22);   // child(no parameter) call
        }
}
