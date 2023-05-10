// Delete(int strat,int end)(start character and end character) end character is -1

class DeleteDemo{
	public static void main(String [] args){
		StringBuffer str=new StringBuffer("VirajJagtap");

		str.delete(2,8);
		System.out.println(str);
	}
}
