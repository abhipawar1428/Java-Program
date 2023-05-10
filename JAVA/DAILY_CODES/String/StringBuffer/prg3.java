//StringBuffer with initial capacity
class SBDemo{
	public static void main(String[] args){
		/* 
		We can initilize StringBuffer by 3 types
	       1. StringBuffer sb=new StringBuffer("Abhi");            it has initial capacity 16+4=20
	       2. StringBuffer sb=new StringBuffer();                  it has initial capacity 16+0=16
	       3. StringBuffer sb=new StringBuffer(100);               it has initial capacity 100
	       */

		
		
		StringBuffer sb=new StringBuffer(100);

		System.out.println(sb);               //
		System.out.println(sb.capacity());    //100
		
		sb.append("abhishek");
		sb.append("Core2Web");
		System.out.println(sb);               //abhishekCore2Web
		System.out.println(sb.capacity());    //100




	}
}
