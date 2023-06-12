class Parent{
	int x=10;
	Parent(){
		System.out.println("In Parent constructor");
	}

	void access(){
		System.out.println("In Parent' instance method");
	}
}
class Child extends Parent{
	int y=20;

	Child(){
		System.out.println("In Child contructor");
		System.out.println(x);
		System.out.println(y);
	}
}
class Client{
	public static void main(String[] args){
		Child obj=new Child();
		obj.access();
	}
}
// IN parent Constructor 
// in child constructor 
// 10
// 20
// In parent instance method 
