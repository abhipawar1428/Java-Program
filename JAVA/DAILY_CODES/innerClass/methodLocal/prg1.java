class Outer{
	void m1(){
		class Inner{                 //claas name-Outer$1Inner.class 
			void m1(){
				System.out.println("In m1 Inner");
			}
		}
		Inner obj=new Inner();    //create object here only or return object and use inheritance
		obj.m1();

	}
	void m2(){
		System.out.println("In m2 outer");
	}

}
class Client{
	public static void main(String[] args){
		Outer obj=new Outer();
 	        obj.m1();
	        obj.m2();


	}
}
