import java.io.*;
class demo{
	public static void main(String[] args)throws IOException{
	
		for (int i=0;i<args.length;i++){
			System.out.print(args[i]+"  ");
		}
	}
}
/*
command line argument are used to give input at runtime 
It stores values in String[] args array
Give values at time of run code (it stores value as string even we enter other data type values)
after compiling run code ...eg. java demo abhi ghsgv 55.2 55 /// "&" 55.5f
Output is abhi ghsgv 55.2 55 /// & 55.5f
*/
