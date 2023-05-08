import java.util.Scanner;
class MyCharAt{
	static char myCharAt(String str,int index){
		char arr[]=str.toCharArray();
		return arr[index];
	}
	public static void main(String[] ars){
		String str="Abhishek";
		System.out.println("Enter Index");
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();         
		if(index>=0 && index<str.length()){
			char ch=myCharAt(str,index);
			System.out.println("Char at "+index+" is "+ch);
		}else{
			System.out.println("error:StringIndexOutOfBound");
		}
	}
}
