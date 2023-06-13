abstract class SPPU{
	abstract void collegeFee();	
}
class college extends SPPU{
	void collegeFee(){
		System.out.println("105000");
	}
}
class Client{
	public static void main(String[] args){
		SPPU skn=new college();
		skn.collegeFee();
	}
}
