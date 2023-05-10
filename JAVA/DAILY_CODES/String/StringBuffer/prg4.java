class SBDemo{
	public static void main(String[] args){
		String str1="Shashi";
		String str2=new String("Abhi");
		StringBuffer str3=new StringBuffer("C2W");

	//	String str4=str1.append(str3);           //cannot found symbol-append  ,bcz append is method of StingBuffer not String(here str1 is String)
	//	String str4=str3.append(str1);           //error-StringBuffer cannot converted to string
	
		StringBuffer str4=str3.append(str1);     //internal call-StringBuffer str4=new StringBuffer("C2WShashi");

		System.out.println(str1);                //Shashi
		System.out.println(str2);                //Abhi
		System.out.println(str3);                //C2WShashi
		System.out.println(str4);                //C2WShashi

		System.out.println(System.identityHashCode(str3));       
		System.out.println(System.identityHashCode(str4));              //str3 and str4 haves same identity HashCode
	


	}
}
