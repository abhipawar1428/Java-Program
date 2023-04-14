import java.util.*;

class Demo{
	void add(int a,int b){
		int ans=a+b;
		System.out.println(ans);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Integer values");
		int a=sc.nextInt();
		int b=sc.nextInt();

		Demo obj=new Demo();
		obj.add(a,b);

	}
}
