import java.io.*;
class Demo{
	public static void main(String[] args){
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));



		int data=0;
		try{
			//br.close();
			data=Integer.parseInt(br.readLine());
			//br.close();  
			System.out.println("after br.close()");
			System.out.println(10/data);
		}catch(IOException ie){
			System.out.println("IOException occured");
		}catch(ArithmeticException ae){
			System.out.println("ArithmaticException Occured:Divide by zero");
		}catch(NumberFormatException ne){
			System.out.println("NumberFormatException Occured:String Cannot Converted to int \n Reenter Int data");
			
			//br.close();   :Unreported exception IOException error occured: write in try or throw
			try{
				br.close();
				data=Integer.parseInt(br.readLine());
				
				System.out.println(10/data);
			}catch(IOException ie){
				System.out.println("IOException ocuured");
			}catch(ArithmeticException ae){
				System.out.println("ArithmaticException Occured:Divide by zero");
			}catch(NumberFormatException ne2){
				System.out.println("NumberFormatException : Not entered it data");
			}
		}
	}
}
