//final methods are not allowed to override
//if we want to didnot override any method then declared it as final
class Parent{
	final void fun(){
	}
}
class Child extends Parent{
	void fun(){        //error-overridden method is final
	
	}
}
