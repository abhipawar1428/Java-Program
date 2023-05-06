class Demo{
	public static void main(String[] args){
		String str1="Abhi";
		String str2=new String("Abhi");

		if(str1==str2){
			System.out.println("Strings are equal(Identified by ==)");
		}else{
			System.out.println("String are not equal(Identified by ==)");
		}

		if(str1.equals(str2)){
			System.out.println("String are equal(Identified by equals method)");
		}else{
			System.out.println("Strings are not equal(Identified by equals method)");
		}

		// == compares Identity HashCode of Strings 
		// so in above e.g first else will be true as str1 is in SCP and str2 is in heap area
		// so it denotes this strings are inequal
		// but string comparasion should be done with equals method
		//if str2 is also from scp then first if will be true
		
		//For String comparision we use equals method 
		//this strings have same content so second if is true and this strings are equal

	}
}
