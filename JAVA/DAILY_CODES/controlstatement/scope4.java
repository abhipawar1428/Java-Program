class scope{
	public static void main(String[] args){
		int x=101;
		{
			int x=20;   //error     already declared x above
			System.out.println(x);
		}
		{
			int x=25;    //error    alredy declared x above
			System.out.println(x);
		}
		System.out.println(x);
	}
}
