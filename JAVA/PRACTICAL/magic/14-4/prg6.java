import java.io.*;

class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Enter two characters");
		char ch1=(char)br.read();
		br.skip(1);
		char ch2=(char)br.read();

		if(ch1==ch2){
			System.out.println("Equal");
		}else{
			int diff=ch2-ch1;
			System.out.println("Difference  between "+ch1+" and "+ch2+" is "+diff);
		}

	}
}
