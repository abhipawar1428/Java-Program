class Demo{
	public static void main(String[] args){
		String str1="Shashi";
		String str2=new String("Shashi");
		String str3="Shashi";
		String str4=new String("abhi");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());

		//hashCode is different from identity.hashCode
		//as identityHashCode is like address and hashCode is basically some how likes content of string
		//above strings contains same value so hashCode os all is similar
	}
}
