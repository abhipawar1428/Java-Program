class methodDemo{
	int x=10;
	static int y=20;
	public static void main(String[] args){
		methodDemo obj=new methodDemo();
		System.out.println("In main");
		System.out.println(obj.x);
		System.out.println(y);

		obj.fun();
		gun();
	}
	static void gun(){
		System.out.println("In gun");

	}
	void fun(){
		System.out.println("In fun");
	}

}
