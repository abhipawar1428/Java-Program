//addition of factorial of each digit of given number
import java.io.*;

class addFact{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number");

		int num=Integer.parseInt(br.readLine());
		int fact=1,sum=0;
		while(num!=0){
			int rem=num%10;
			for(int i=1;i<=rem;i++){
				fact=fact*i;
			}
			sum=sum+fact;
			fact=1;
			num=num/10;

		}
		System.out.println("Addition of Factorial of each digit of number is "+sum);
	}
}
