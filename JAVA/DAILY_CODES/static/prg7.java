//static variables are not allowed to initialize inside any block,method
//
//
class Demo{
	static int x=10;

	static{
		static int y=20;          //error

	}

	static void fun(){
		static int z=30;          //error
	}

	void gun(){
		static int m=40;          //error
	}
	//error-illegel start of expression
}
