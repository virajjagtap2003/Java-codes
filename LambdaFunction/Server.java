import java.net.*;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.*;

class Server1{
	public static void main(String[] args)throws IOException{
		ServerSocket ss=new ServerSocket(1200);
		Socket s= ss.accept();

		System.out.println("Connection Established");
			
                
		OutputStream os=s.getOutputStream();
		PrintStream ps=new PrintStream(os);

		 InputStream is=s.getInputStream();

		 BufferedReader br=new BufferedReader(new InputStreamReader(is));

		 String clientMessage;
		 String serverMessage;

		while(true){
			clientMessage=br.readLine();
			System.out.println("ClientMessage==  "+clientMessage);
			System.out.println("Server== ");
			BufferedReader userInput=new BufferedReader(new InputStreamReader(System.in));
			serverMessage=userInput.readLine();
			ps.println(serverMessage);
		}

	
	}
}
