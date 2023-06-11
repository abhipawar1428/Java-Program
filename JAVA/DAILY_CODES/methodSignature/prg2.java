class Demo{
	Demo(){
		System.out.println("In constructor");
	}
	int fun(){
		return 0;		
	}
	int fun(int x){
		return 0;
	}
/*	void fun(int x){
	     //error for this method = already defined fun(int)
	}
*/	void fun(float x){
	
	}
	Demo(int x){
		
	}

}
/*
 * return type is not mentioned in signature table
 * signature is each entry in table and it written as fun(int)
 * at compilation signature table is created that stores method name with its parameters
 *
 * If same entry as previous signature comes then compiler throws error because same signature causes ambiguity
*/ 
