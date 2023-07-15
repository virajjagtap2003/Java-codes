// maximum and minimum element from array
import java.io.*;
class ArrayDemo{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int arr[]={3,200,5,40,10};
                int index=0;
                int max=arr[0];
		int min=arr[0];
                for(int i=1;i<arr.length;i++){

                        if(max<arr[i]){
                                max=arr[i];
                   	}
                }
                System.out.println(max);

		for(int i=1;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
                System.out.println(min);
        }
}
