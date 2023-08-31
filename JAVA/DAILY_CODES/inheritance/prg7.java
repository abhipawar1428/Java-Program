class Parent{
	static int x=10;
	static{
		System.out.println("In Parent static");
	}
	static void access(){
		System.out.println(x);
	}
}
class Child extends Parent{
	static{
		System.out.println("in Child Static");
		access();
	}
}
class Client{
	public static void main(String[] args){
		System.out.println("In main");
		Child obj=new Child();
	}
}
/*
In main
In parent static
in child static 
10

*/

