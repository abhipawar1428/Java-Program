class PolyDemo{
	PolyDemo(){
		System.out.println("In No args Constructor");
	}

	PolyDemo(int x){
		System.out.println("In para 1 Constructor");
	}

	PolyDemo(int x,int y){
		System.out.println("In para 2 Constructor");
	}

	public static void main(String[] args){
		PolyDemo obj1=new PolyDemo();
		PolyDemo obj2=new PolyDemo(10);
		PolyDemo obj3=new PolyDemo(10,20);

		//In No args Constructor
		//In para 1 Constructor
		//In para 2 Constructor

	}
}
