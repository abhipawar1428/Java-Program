interface RBI{
	void bankId();
	void rateOfInterest();
	static void guildLines(){
		System.out.println("RBI guildlines are mandatory to all banks");
	}
	default void fdRate(){
		System.out.println("FD rate of interest is 3 %");
	}
}
class HDFC implements RBI{
	public void rateOfInterest(){
		System.out.println("HDFC rate of interest is 10%");
	}
	public void bankId(){
		System.out.println("HDFC bank id=101");
	}
	public void fdRate(){
		System.out.println("HDFC FD rate of interest is 2 %");
	}

}
class ICICI implements RBI{
	public void rateOfInterest(){
		System.out.println("ICICI rate of interest is 11%");
	}
	public void bankId(){
		System.out.println("ICICI bank id=102");
	}
}
class AXIS implements RBI{
	public void rateOfInterest(){
		System.out.println("AXIS rate of interest is 8%");
	}
	public void bankId(){
		System.out.println("AXIS bank id=103");
	}
	public void fdRate(){
		System.out.println("AXIS FD rate of interest is 4 %");
	}
}
class Client{
	public static void main(String[] args){
		RBI.guildLines();                           //RBI guildlines are mandatory to all banks
		
		RBI hdfc=new HDFC();
		hdfc.bankId();                              //HDFC bank id =101
		hdfc.rateOfInterest();                      //HDFC rate of intrest is 10%
		hdfc.fdRate();                              //HDFC fd rate of interest is 2%
		
		RBI icici=new ICICI();
		icici.bankId();                             //ICICI bank id =102
		icici.rateOfInterest();                     //ICICI rate of interest is 11%
		icici.fdRate();                             //ICICI fd rate of interest is 3%
		
		RBI axis=new AXIS();
		axis.bankId();                              //AXIS bank id=103
		axis.rateOfInterest();                      //AXIS rate of intrest is 8%
		axis.fdRate();                              //AXIS fd rate of interest is 4%
	}


}
