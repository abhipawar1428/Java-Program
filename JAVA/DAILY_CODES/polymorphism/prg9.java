class Parent{
	char fun(){
		System.out.println("Parent fun");
		return 'A';
	}
}
class Child extends Parent{
	int fun(){                     //error bcz diff datatypes
		System.out.println("Child fun");
		return 10;
	}
}
class Client{
	public static void main(String[] args){
		Parent P=new Child();
		P.fun();
	}
}
