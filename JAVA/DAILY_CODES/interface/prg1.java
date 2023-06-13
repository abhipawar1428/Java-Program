interface Demo{
	void fun();
	void gun();
}
class ChildDemo implements Demo{
	public void fun(){
		System.out.println("In Fun");
	}
	public void gun(){              //method should be public bcz in interface compiler adds public abstract automatically to all methods...if we don't write public then it will be default and then error will be comes(attempting to assign weaker access privileges)
		System.out.println("In gun");
	
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new ChildDemo();
		obj.fun();
		obj.gun();
	}
}
