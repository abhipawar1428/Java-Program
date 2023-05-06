import java.util.*;

class Demo{
	void add(int a,int b){
		int ans=a+b;
		System.out.println("Add= "+ans);
	}
	void sub(int a,int b){
		int ans=a-b;
		System.out.println("Sub= "+ans);
	}
	void mult(int a,int b){
		int ans=a*b;
		System.out.println("Mult= "+ans);
	}
	void div(int a,int b){
		int ans=a/b;
		System.out.println("Div= "+ans);
	}

	public static void main(String[] args){
		Demo obj=new Demo();
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter integer values");
		int a=sc.nextInt();
		int b=sc.nextInt();

		obj.add(a,b);
		obj.sub(a,b);
		obj.mult(a,b);
		obj.div(a,b);
	}
}
