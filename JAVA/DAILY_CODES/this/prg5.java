//changing value of private instance variable using this refernce
class Player{
	private int jerNo=0;
	private String name=null;

	Player(int jerNo,String name){
		this.jerNo=jerNo;
		this.name=name;
	}

	void Disp(){
		System.out.println(jerNo+" "+name);
	}
}
class Client{
	public static void main(String[] args){
		Player virat=new Player(18,"Virat Kohli");
		virat.Disp();
		
		Player rohit=new Player(45,"Rohit Sharma");
		rohit.Disp();
	}
}
