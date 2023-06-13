class parent{
	static void fun(){
	
	}
}
class child extends parent{
	void fun(){           //error- overridden method is static
		             //static methods are not allowed to override
	}
}
