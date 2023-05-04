// Take to strings from user and check length if same print both are same otherwise not same (without using length Method)
import java.io.*;
class checkDemo{
		static int mystrlen(String str){
			char arr[]=str.toCharArray();
			int count=0;
			for(int i=0;i<arr.length;i++){
				count++;
			}
			return count;
		}

	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first string");
		String str1=br.readLine();
		System.out.println("Enter second string");
		String str2=br.readLine();

		if(mystrlen(str1)==mystrlen(str2)){
			System.out.println("Equal Length");
		}else{
			System.out.println("Not Equal Length");
		}

	}
}
