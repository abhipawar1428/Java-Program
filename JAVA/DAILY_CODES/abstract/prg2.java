abstract class Parent{
	void career(){
		System.out.println("Engineer");
	}
	abstract void marry();
}
class Child extends Parent{
	//gives body to all methods that are inherited
	//otherwise declare class as abstract
	//here,we didn't gave body to marry() and also didn't declare class as abstract
	//so here error occurs
}

