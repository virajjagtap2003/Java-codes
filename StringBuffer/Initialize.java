class Declare{
	public static void main(String [] args){
		StringBuffer sb=new StringBuffer(30);   // Declare Capacity of buffer
		sb.append("Biencaps");
		sb.append("core2web");

		System.out.println(sb);
		System.out.println(sb.capacity());

		sb.append("Shashi");

		System.out.println(sb);
		System.out.println(sb.capacity());

		sb.append("VirajJagtap");   // After reaching the capacity 30 it will be (currentcapacity 30+1*2=62)
		
		System.out.println(sb.capacity());
	}
}
