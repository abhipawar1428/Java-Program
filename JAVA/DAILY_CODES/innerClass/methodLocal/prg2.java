class Outer{
	Object m1(){
		class  Inner {
			void m2(){
				System.out.println("In m1 Inner");
			}
		}
		return new Inner();
	}
}
class Client {
	public static void main(String[] args){
		Outer obj=new Outer();
		obj.m1().m2();
//		Demo        //error- m2() not find as m1() is local method
//					and returned object is popped as method popped
             	
				      
	}
}
