class Parent{
	int x=10;
	static int y=20;
	Parent(){
		System.out.println("In Parent");
	}

}
class Child extends Parent{
	int x=100;
	static int y=200;

	Child(){
		System.out.println("In Child");
	}

	void access(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(super.x);
		System.out.println(super.y);
	}
}
class Client{
	public static void main(String[] args){
		Child obj=new Child();
		obj.access();
	}
}
/*
 * in parent
 * in child
 * 100
 * 200
 * 10
 * 20
*/
