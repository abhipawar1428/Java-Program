class IPL{
	void matchInfo(String team1,String team2){
		System.out.println(team1+" VS "+team2);
	}
	void matchInfo(String team1,String team2,String Venue){
		System.out.println(team1+" VS "+team2);
		System.out.println("Venue= "+Venue);
	}

}
class Client{
	public static void main(String[] args){
		IPL final23=new IPL();
		final23.matchInfo("GT","CSK");
		final23.matchInfo("GT","CSK","NMSA");
	}
}
