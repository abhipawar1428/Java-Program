//In overriding, return types of method should be same in primitives datatypes only
//in case of Covarent datatypes, if datatypes are not same then also fine.not problem there
//But bigger data type (like Object class) should in Parent.It can be overriden in smaller datatype(String)
class Parent{
	Object fun(){
		Object obj=new Object();
		System.out.println("In Parent Fun");
		return obj;         //or=>return new Object();
	}
}
class Child extends Parent{
	String fun(){
		System.out.println("In Child fun");
		return "Abhi";
	}
}
class Client{
	public static void main(String[] args){
		Parent obj=new Child();
		obj.fun();        //if this method's return type we catch
		                  //suppose ,if return type is String 
				  //and child override parent's String fun(); method into Object fun() then there will be chances of data loss
				  //so there will be always parent class contain big datatype
				  //
				  //and if parent contains Object fun() and if child override it to String fun() then there will not daa loss 
				  //
				  //hance I think thier will be always bigger datatype in Parent class and not opposite 
	}
}

