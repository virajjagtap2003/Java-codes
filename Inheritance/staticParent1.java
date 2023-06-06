class Parent{
        static int x=10;
        static{
                System.out.println("In parent static ");
                System.out.println(x);
        }
       static void access(){
		System.out.println(x);
	}
}
class Child extends Parent{
        static{
                System.out.println("In child static");
                System.out.println(x);
		access();

        }
}
class Client{
        public static void main(String[] args){
               
                Child  obj2=new Child();

                System.out.println("In main");
        }
}
