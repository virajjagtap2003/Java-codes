// In catch first child and then parent sequence allowed (throwable->exception->runtime exception->Numberformat exception
import java.io.*;
class TryDemo{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                String str=br.readLine();
                System.out.println(str);
                int no=0;
                try{
                         no=Integer.parseInt(br.readLine());
                }catch(NumberFormatException obj1){ 
			System.out.println("Enter integer number");
                         no=Integer.parseInt(br.readLine());
                         System.out.println(no);
		}
		catch(RuntimeException obj){  
                        System.out.println("Please Enter integer number");
                         no=Integer.parseInt(br.readLine());
                         System.out.println(no);
                }
        }
}
                                                                      
