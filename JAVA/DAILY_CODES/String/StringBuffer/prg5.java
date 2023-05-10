class SBDemo{
	public static void main(String[] args){
	
		String str1="Shashi";
		String str2=new String("Bagal");

		StringBuffer str3=new StringBuffer("C2W");

		//String str4=str1.concat(str3);             //String only allow String as parameter to concat
		                                             //We are trying to pass StringBuffer so it gives 
							     //error-StringBuffer cannot be converted to String
		StringBuffer str5=str3.append(str2); 

		System.out.println(str1);                    //Shashi
		System.out.println(str2);                    //Bagal
		System.out.println(str3);                    //C2WBagal
		System.out.println(str5);                    //C2WBagal


		str1.concat(str2);                           //Shashi is stored in str1
		str3.append(str2);                           //C2WBagalBagal is stored in str3
		str3.append(str3);                           //C2WBagalBagalC2WBagalBagal is stored in str3
		
		System.out.println(str1);                    //Shashi
		System.out.println(str3);                    //C2WBagalBagalC2WBagalBagal

	}
}
