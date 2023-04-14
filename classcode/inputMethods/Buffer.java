import java.io.*;

class BufferedDemo{
	public static void main(String[] args) throws IOException{
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter name");
		String name=obj.readLine();
		System.out.println("Enter age");
		int age=Integer.parseInt(obj.readLine());

		System.out.println("Name= "+name);
		System.out.println("Age= "+age);
	}

}
