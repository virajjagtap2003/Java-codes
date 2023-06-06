class Parent{
        Parent(){
                System.out.println("In parent constructor");
        }
        void fun(int x){

                System.out.println("In parent fun");
        }
}
class Child extends Parent{
        Child(){

                System.out.println("In child constructor");
        }
        void fun(){

                System.out.println("In child fun");
        }
}
class Client{
        public static void main(String[] args){
                Parent obj1=new Child();
                obj1.fun(10);    
//		obj1.fun();// error require int found no argument

   		Parent obj2=new Child();
	//	obj2.fun(); //  require int found no 
	//
		Child obj3=new Child();
		obj2.fun(22);   // True it contains both parent(parameter) and child(no parameter) It goes to parent Fun(int x)
        }
}
