import java.io.*;

class FileDemo{
	public static void main(String[] args){
		File file=new File("Folder1");
		System.out.println(file.mkdir());

		File file2=new File("Folder1");
		System.out.println(file2.mkdir());
	}
}
