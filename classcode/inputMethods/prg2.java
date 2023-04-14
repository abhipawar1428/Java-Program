//enter dream company and enter expectd package
import java.util.Scanner;

class ScannerDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter company name");
		String comName = sc.next();

		System.out.println("Enter expected package");
		Double lpa= sc.nextDouble();


		System.out.println("Company="+comName);
		System.out.println("LPA="+lpa);
	}
}
