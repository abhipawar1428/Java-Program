import java.util.*;

class IODemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Player Info");
		String str1=sc.nextLine();

		StringTokenizer st=new StringTokenizer(str1,",");
		
		System.out.println("No of Tokens= "+st.countTokens());

		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

	}
}
