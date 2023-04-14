class logical{
	public static void main(String[] args){
		int x=10,y=20;

		boolean ans1= x>y || x<y;   //data type should be boolean only for logiacl operator(int not allowed)
		boolean ans2= x>y && x<y;

		System.out.println(ans1);
		System.out.println(ans2);
	}
}
