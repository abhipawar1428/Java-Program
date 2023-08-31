//write program to count files and folders present in any Directory
import java.io.*;
class CountFiles{
	public static void main(String[] args)throws IOException{
	//File f1=new File("/home/abhipawar93/main/JAVA_DSA/JAVA/DAILY_CODES/fileHandling");
	File f1=new File("/etc");

	if( f1.exists()){
		String files[]=f1.list();

		int fileCount=0;
		int folderCount=0;

		for(String str:files){
			File file=new File(str);
			if(file.isFile()){
				//System.out.println(str);
				fileCount++;
			}else{
				//System.out.println(str);
				folderCount++;
			}
		}
		System.out.println("Total Files: "+fileCount+ "\nTotal Folders: "+folderCount+"\n");
	}else{
		System.out.println("Folder Not Fount");
	}


	}

	
}
