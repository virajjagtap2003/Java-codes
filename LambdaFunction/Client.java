import java.io.*;
import java.net.*;
class Client1{
	public static void main(String[] args)throws IOException{
		Socket s=new Socket("localHost",1200);
		
		OutputStream os=s.getOutputStream();
		PrintStream ps=new PrintStream(os);


		InputStream is=s.getInputStream();

		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		String serverMessage;
		String clientMessage;



		while(true){
			serverMessage=br.readLine();
			System.out.println("Server== "+serverMessage);
			
			System.out.println("Client== ");
              		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
			clientMessage=userInput.readLine();
			ps.println(clientMessage);
		
		}
	

	}
}
