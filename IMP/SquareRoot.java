// check square root  100 =10*10
import java.io.*;
class Root{

	static int Sqrt(int num){
		int val=0;
		for(int i=1;i<=num;i++){
		 	if(i*i==num || i*i<=num){//i*i<=num(for if suppose input 54 there is no perfect squareRoot so here it returns 7 i.e 7*7=49(less square number) 
				val=i;
			}
		}
		return val;
	}
	
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int no=Integer.parseInt(br.readLine());
		int ans=Sqrt(no);
		System.out.println(ans);
	}
}
