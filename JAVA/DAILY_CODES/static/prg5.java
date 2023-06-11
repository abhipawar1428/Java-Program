class StaticDemo{
	static int x=10;
	static int y=20;

	static void disp(){
		System.out.println(x);
		System.out.println(y);
	}

}
class Client{
	public static void main(String[] args){
		//we can call static variables without creating object of class (by using class_name) 
		
		System.out.println(StaticDemo.x);
		System.out.println(StaticDemo.y);
		StaticDemo.disp();
	}

}
