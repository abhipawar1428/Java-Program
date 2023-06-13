class Parent{
	Parent(){
		System.out.println("In Parent constructor");

	}
	void parentProperty(){
		System.out.println("Car,Gold,Home");
	}
	void marry(){
		System.out.println("Deepika");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("In Child constructor");
	}
	void marry(){
		System.out.println("Aliya");
	}
}
class Client{
	public static void main(String[] args){
		Child obj=new Child();
		obj.parentProperty();
		obj.marry();
	}
}
/*
 *In parent constructor
 in child constructor
 car,gold,home
 Aliya
 */
