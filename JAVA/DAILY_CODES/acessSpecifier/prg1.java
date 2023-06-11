class Demo{
	int x=10;
	private int y=20;
	String str="Om";

	void fun(){
		System.out.println(x);
		System.out.println(y);
	}
}
class MainDemo{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun();

	
		System.out.println(obj.x);    //10
//		System.out.println(obj.y);    //error- acceesing private variable 
		System.out.println(obj.str);  //Om

//		System.out.println(x);        //error- cannot find symbol
//		System.out.println(y);        //error- cannot find symbol
	}
}
