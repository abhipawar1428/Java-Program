import java.io.*;
class FileDemo{
	public static void main(String[] args)throws Exception{
		File fobj=new File("abhi.txt");        //must import io package
		System.out.println(fobj.exists());

		fobj.createNewFile();                 //throws ioException
		
		System.out.println(fobj.exists());

		FileWriter fw=new FileWriter(fobj);
		fw.write("hiii");
		fw.close();
		

	}
}
