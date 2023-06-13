class Parent{
	static{
		System.out.println("In Parent static block");
	}
}
class Child{
	static{
		System.out.println("In Child static block");
	}

}
class Client{
	public static void main(String[] args){
		System.out.println("In client main");
	}
}
