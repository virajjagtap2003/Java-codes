// Append (Return type= StringBuffer)

class AppendDemo{
	public static void main(String [] args) {
		StringBuffer sb=new StringBuffer("Viraj");
		sb.append("jagtap");
		
		System.out.println(sb);

//		String str=sb.append("Java"); // Incompactible
		String str2="Core2Web";

		StringBuffer str3=sb.append(str2); // sb will also become virajcore2web
		System.out.println(str3);

		System.out.println(sb);

	}
}
