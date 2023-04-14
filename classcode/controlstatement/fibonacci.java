class fibo{
	public static void main(String[] args){
		int a=0,b=1,c=1;
		int num=50;
		System.out.print("0 ");
		while(c<=num){
			System.out.print(c+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}
