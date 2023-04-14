class scope{
	public static void main(String[] args){
		int x=15;
		{
			int y=20;
			System.out.println(x+" "+y);
		}
		{
			System.out.println(x+" "+y); //cannot find symbol y
		}
		System.out.println(x+" "+y);  //cannot find symbol y
	}
}
