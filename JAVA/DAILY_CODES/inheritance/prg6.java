class Parent{
	static int x=10;
	static{
		System.out.println("In parent static block");
	}
	static void access(){
		System.out.println(x);
	}
}
class Child extends Parent{
	static{
		System.out.println("In Child static block");
		System.out.println(x);
		access();

	}
}
class Client{
	public static void main(String[] args){
		Child obj=new Child();
		Child.access();
		obj.access();
	}
}
/*In parent static block
 * In child static block
 * 10;
 * 10
 * 10
 * 10
 */
