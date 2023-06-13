class Singleton{
	static Singleton obj=new Singleton();        //it similar to - static int x=10;
	//static is to call directly from getobj() mathod
	
	private Singleton(){
	}                             //private for not to create object

	static Singleton getObject(){      //static for to call diretly from another class 
		return obj;
	}
}
class Client{
	public static void main(String[] args){
		Singleton obj=Singleton.getObject();   //this is similar to int ret=Demo.fun();
		System.out.println(obj);
		
		Singleton obj1=Singleton.getObject();
		System.out.println(obj1);
		
		Singleton obj2=Singleton.getObject();
		System.out.println(obj2);
		//object is created within class only 
		//every time we get same object
		//
		//In Singleton Design paattern we create one object only
	}
}
