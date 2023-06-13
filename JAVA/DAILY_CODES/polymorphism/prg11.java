class Parent{
	public void fun(){
		System.out.println("In fun parent");
	}
}
class Child extends Parent{
/*	void fun(){                                          //error-attempting to assign weaker access privileges was public
		System.out.println("In fun Child");
	}
*/
	public void fun(){
		System.out.println("In fun Child");
	}

}
class Client{
	public static void main(String[] args){
		Parent obj=new Child();
		obj.fun();
	}
}
