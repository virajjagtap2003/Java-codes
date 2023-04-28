// Take dimensions of row is 3(arr[0]=3,arr[1]=2),arr[2]=1 and take elements from user 
import java.io.*;
class Jagged2{
	public static void main(String [] args)throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int arr[][]=new int[3][];
			arr[0]=new int[3];
			arr[1]=new int[2];
			arr[2]=new int[1];

			System.out.println("enter array elements");
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[i].length;j++){
					arr[i][j]=Integer.parseInt(br.readLine());
				}
			}
			System.out.println("Displaying array");
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[i].length;j++){
					System.out.print(arr[i][j]+"  ");
				}
				System.out.println();
			
			}
			System.out.println("using for each loop");
			for(int[] x:arr){
				for(int y:x){
					System.out.print(y+"  ");
				}
				System.out.println();
			}


	}
}
