// maximum element from array
import java.io.*;
class ArrayDemo{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int arr[]={30,200,5,4,1};
                int index=0;
                int max=arr[0];
                for(int i=1;i<arr.length;i++){

                        if(max<arr[i]){
                                max=arr[i];
                        }
                }
                System.out.println(max);
        }
}
