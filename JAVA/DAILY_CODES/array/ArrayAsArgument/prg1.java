class demo{
	void fun(int x,int y){
		System.out.println(x);
		System.out.println(y);

		x=x+10;
		y=y+10;


		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args){
		demo obj=new demo();
		int x=10;
		int y=20;

		System.out.println(x);
		System.out.println(y);
		obj.fun(x,y);

		System.out.println(x);
		System.out.println(y);
	}
	//output is 
	//10 
	//20 
	//10
	//20
	//20 
	//30
	//10
	//20
}
