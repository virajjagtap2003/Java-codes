import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException {
		int no=1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of lines");
		int lines=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=lines;i++){
			no=1;
			for(int j=1;j<i;j++){
				System.out.print(no+"  ");
				no++;
			}
		
			
			System.out.println();
		}
	}
}
