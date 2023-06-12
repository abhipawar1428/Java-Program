class Parent{
	Parent(){
		System.out.println("In Parent Constructor");
	}
	void parentProperty(){
		System.out.println("Car,Gold,Home");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("In Child Constructor");
	}
}
class Client{
	public static void main(String[] args){
		Child obj=new Child();
		obj.parentProperty();
	}
}//in parent
//in child
//Car,gold,home
