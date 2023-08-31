import java.io.*;

class FileDemo{
	public static void main(String[] args)throws IOException{
		File file=new File("Folder1","Folder2");
		file.mkdirs();

		File file1=new File("Folder1/Folder2","file1");
		file1.createNewFile();
		System.out.println(file.getName());

		System.out.println(file1.getName());

		//File file3=new File("f1","f2");
		//file3.createNewFile();                //erroe->no f1 directory present
	
		System.out.println(file1.delete());      //returns true if successfully deleted
		System.out.println(file1.delete());      //returns false bcz file not present. It deleted in previous line


	}
}
