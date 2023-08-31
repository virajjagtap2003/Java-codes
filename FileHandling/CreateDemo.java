// File contains 4 constructor 1.String 2.(String,String) 3.(FolderName,String) 4.net.uri
import java.io.*;
class FileFolder{
	public static void main(String[] args) throws IOException{
		// Creating new file into current working folder
		File fobj1=new File("Core.txt");
		fobj1.createNewFile(); // Here new file was create and it throws IOException


		// Creating new Folder into current working folder

		File fobj2=new File("FileHandling");
		fobj2.mkdir();

		// Creating folder inside a folder

		File fobj3 =new File("FileHand","Code1");
		fobj3.mkdirs();

		// Creating file inside our choice folder
		
		File fobj4=new File("Demo");
		fobj4.mkdir();

		File fobj5=new File(fobj4,"NEW FILE.txt");
		fobj5.createNewFile();
		


	}
}
