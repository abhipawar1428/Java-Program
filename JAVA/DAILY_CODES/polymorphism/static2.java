class parent{
	void fun(){
	
	}
}
class child extends parent{
	static void fun(){           //error- overridding method is static
		                   //static methods are not allowed to override
	}
}
