// Change private variable from outside the class ( using this)  because same variable

class Player1{
        private int jerNo=0;  // instance to local 
        private String pname=null;

        Player1(int jerNo,String pname){
                this.jerNo=jerNo;
		this.pname=pname;

        }
        void info(){
                System.out.println(jerNo+"="+pname);
        }

}
class Client1{
        public static void main(String[] args){
                Player1 obj1=new Player1(18,"Virat");
                obj1.info();

                Player1 obj2=new Player1(7,"MSD");
                obj2.info();

                Player1 obj3=new Player1(45,"Rohit");
                obj3.info();

	}
}	
