class Parent{
	static{
		System.out.println("In parent static");
	}
}
class Child extends Parent{
	static{
		System.out.println("In child static");
	}
	
}
class Client{
	public static void main(String[] args){
		Parent obj=new Parent();
		Child obj1=new Child();	
	}
}
