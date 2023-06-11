class Demo{
	private int x=10;
	private static int y=20;

	void fun1(){
		System.out.println(x);
		System.out.println(y);
	}
	static void fun2(){
		Demo obj=new Demo();
		System.out.println(obj.x);
		System.out.println(y);
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun1();
		Demo.fun2();
		obj.fun2();
		//we can't directly call x and y bcz they are private
	}
}
//10
//20
//10
//20
//10
//20
