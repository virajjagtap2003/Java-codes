import java.io.*;
class Count{
	public static void main(String[] args)throws IOException{
		File fobj1=new File("/home/viraj123/main/FileHandling"); // provide exact location of folder
		System.out.println(fobj1.exists());
		System.out.println(fobj1.getPath());
		System.out.println(fobj1.getAbsolutePath());

		String[] Files = fobj1.list(); // files are type of string and those files are pass to string array
		int count=0;
		for(String str: Files){
			//str.isFile();  // String not have isFile Method

			File f=new File(str);

			if(f.isFile()){    // isFile method is same like hasNext Method from 
				count++;
			}
		}
		System.out.println(count);
	}
}
