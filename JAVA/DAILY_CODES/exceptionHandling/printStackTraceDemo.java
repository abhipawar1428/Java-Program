import java.io.*;
class Demo{
	public static void main(String[] args){
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int data=0;
		try{
			//br.close();
			data=Integer.parseInt(br.readLine());
			//br.close();  
			//System.out.println("after br.close()");
			System.out.println(10/data);
		}catch(IOException ie){
			ie.printStackTrace();
		}catch(ArithmeticException ae){
			ae.printStackTrace();
		}catch(NumberFormatException ne){
			ne.printStackTrace();
			System.out.println("Enter int data again");
			
			//br.close();   :Unreported exception IOException error occured: write in try or throw
			try{
				br.close();
				data=Integer.parseInt(br.readLine());
				
				System.out.println(10/data);
			}catch(IOException ie){
				ie.printStackTrace();
				
			}catch(ArithmeticException ae){
				ae.printStackTrace();
			
			}catch(NumberFormatException ne2){
				ne2.printStackTrace();
			}
		}
	}
}
