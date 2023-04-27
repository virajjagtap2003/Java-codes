class MethodDemo{
	
	        static void fun(){
			System.out.println("Viraj Jagtap");
			
		}
		 void gun(){					// Throws error because gun is non static and inmain function gun is static so.. (To remove error use static to gun)
			System.out.println("Abhishek Pawar");
		}

		public static void main(String args[]){
			fun();
			gun();
		}
}

