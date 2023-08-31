class Parent{
	static{
		System.out.println("In Parent static block");
	}
	public static void main(String[] args){
		System.out.println("In parent main");
	}
}
class Child{
	static{
		System.out.println("In child static block");
	}
	public static void main(String[] args){
		System.out.println("In child main");
	}
}
class Client{
	static{
		System.out.println("In client static block");
	}
	public static void main(String[] args){
		System.out.println("In client main");
	}
}
