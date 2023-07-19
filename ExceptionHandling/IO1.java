// Close connection
import java.io.*;
class IO{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                String str=br.readLine();
                System.out.println(str); 

		br.close();


                String str1=br.readLine(); // IOException (encure connection)
                System.out.println(str1); 
	}
}
