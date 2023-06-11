//we don't need to create object to call static variables and static methods
//we can access them dirctly within same class or
//they are in diff class then we can access them with help of ClassName
//eg= Demo.x(here Demo is class and x is static variable )
//
//
class Demo{
	static int x=10;
	static int y=20;

	static void disp(){
		System.out.println(x);
		System.out.println(y);
	}
}
class client{
	public static void main(String[] args){
		System.out.println(Demo.x);
		System.out.println(Demo.y);
		Demo.disp();
	}
}
