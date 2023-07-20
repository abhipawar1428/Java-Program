class Outer{
	static class Inner{
		void m1(){
			System.out.println("In m1 Inner");
		}
	}
	void m2(){
		System.out.println("In m2 Outer");
	}
}
class Client{
	public static void main(String[] args){
		Outer.Inner obj=new Outer.Inner();
		obj.m1();
	}
}
