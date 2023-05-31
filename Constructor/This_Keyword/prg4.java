// Global and local

class Global{
        int x=10;  //Global

        Global(){  // Access(Access this)
		System.out.println(x);
		System.out.println(this.x);
                System.out.println("In no argument constructor");
        }
        Global(int x){  //local   Access(Access this,int x)
                System.out.println(x); //20
                System.out.println(this.x); //10

        }
        public static void main(String[] args){
                Global obj1=new Global();  // Access(obj1)
                Global obj2=new Global(20); // Access(obj2,10)
        }
}
