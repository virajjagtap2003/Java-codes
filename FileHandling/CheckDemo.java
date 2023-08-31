import java.io.*;
class CheckDemo{
	public static void main(String[] args)throws IOException{
		File fobj1=new File("Checking.txt");
		fobj1.createNewFile();

		System.out.println(fobj1.getName()); // checking .txt
		System.out.println(fobj1.getParent()); //null

		System.out.println(fobj1.getPath()); // checking.txt
		System.out.println(fobj1.getAbsolutePath()); // return exact path

		System.out.println(fobj1.canRead()); // true
		System.out.println(fobj1.canWrite()); // true

		System.out.println(fobj1.isDirectory()); // false
		System.out.println(fobj1.isFile());  // true
	}
}
