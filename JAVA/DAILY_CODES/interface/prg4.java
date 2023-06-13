interface Demo1{
	static void m1(){
		System.out.println("in Demo1-m1");
	}
}
interface Demo2{
	static void m1(){
		System.out.println("in Demo2-m1");
	}
}
class  DemoChild implements Demo1,Demo2{

}
class Client{
	public static void main(String[] args){
		Demo1 obj1=new DemoChild();
//		obj1.m1();        //error -cannot call using object->call througth interface_name itself
		Demo1.m1();
		Demo2.m1();
	}	
}
