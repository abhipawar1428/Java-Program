class Parent{
	Parent(){
		System.out.println("In Parent constructor");
	}
	void fun(){
		System.out.println("In fun");
	}

}
class Child extends Parent{
	Child(){
		System.out.println("In Child constructor");
	}
	void gun(){
		System.out.println("In gun");
	}

}
class Client{
	public static void main(String[] args){
		Child obj=new Child();
		obj.fun();
		obj.gun();

		Parent obj1=new Parent();
		obj1.fun();
		obj1.gun(); //error->cannot fing symbol
	}
}
