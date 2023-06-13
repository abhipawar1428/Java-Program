abstract class Parent{
	abstract void career();
	abstract void marry();

}
class Child extends Parent{
	void career(){
		System.out.println("Engineer");
	}
	void marry(){
		System.out.println("Aishwarya");
	}
}
class Client {
	public static void main(String[] args){
		Parent obj=new Child();
		obj.career();
		obj.marry();
		
		Child obj1=new Child();
		obj1.career();
		obj1.marry();
	}
}
